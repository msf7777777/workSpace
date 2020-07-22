package bigdata.itcast.cn.mr.flow;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.IOException;

/**
 * @ClassName MRDriver
 * @Description TODO 这是MapReduce程序实现流量分析统计的需求一：统计每个手机号码的上行和下行总和
 * @Date 2020/5/30 10:34
 * @Create By     Frank
 */
public class MRFlow1 extends Configured implements Tool {

    /**
     * 用于将Job的代码封装
     * @param args
     * @return
     * @throws Exception
     */
    @Override
    public int run(String[] args) throws Exception {
        //todo:1-构建一个Job
        Job job = Job.getInstance(this.getConf(),"flow1");//构建Job对象，调用父类的getconf获取属性的配置
        job.setJarByClass(MRFlow1.class);//指定可以运行的类型
        //todo:2-配置这个Job
        //input
//        job.setInputFormatClass(TextInputFormat.class);//设置输入的类的类型，默认就是TextInputFormat
        Path inputPath = new Path("datas/flowCase/data_flow.dat");//用程序的第一个参数做为第一个输入路径
        //设置的路径可以给目录，也可以给定文件，如果给定目录，会将目录中所有文件作为输入，但是目录中不能包含子目录
        TextInputFormat.setInputPaths(job,inputPath);//为当前job设置输入的路径

        //map
        job.setMapperClass(MRMapper.class);//设置Mapper的类，需要调用对应的map方法
        job.setMapOutputKeyClass(Text.class);//设置Mapper输出的key类型
        job.setMapOutputValueClass(FlowBean01.class);//设置Mapper输出的value类型

        //shuffle
//        job.setPartitionerClass(HashPartitioner.class);//自定义分区
//        job.setGroupingComparatorClass(null);//自定义分组的方式
//        job.setSortComparatorClass(null);//自定义排序的方式

        //reduce
        job.setReducerClass(MRReducer.class);//设置Reduce的类，需要调用对应的reduce方法
        job.setOutputKeyClass(Text.class);//设置Reduce输出的Key类型
        job.setOutputValueClass(FlowBean01.class);//设置Reduce输出的Value类型
        job.setNumReduceTasks(1);//设置ReduceTask的个数，默认为1

        //output：输出目录默认不能提前存在
//        job.setOutputFormatClass(TextOutputFormat.class);//设置输出的类，默认我诶TextOutputFormat
        Path outputPath = new Path("datas/output/flow/flow1/output");//用程序的第三个参数作为输出
        //解决输出目录提前存在，不能运行的问题，提前将目前删掉
        //构建一个HDFS的文件系统
        FileSystem hdfs = FileSystem.get(this.getConf());
        //判断输出目录是否存在，如果存在就删除
        if(hdfs.exists(outputPath)){
            hdfs.delete(outputPath,true);
        }
        TextOutputFormat.setOutputPath(job,outputPath);//为当前Job设置输出的路径

        //todo:3-提交运行Job
        return job.waitForCompletion(true) ? 0:-1;
    }

    /**
     * 程序的入口，调用run方法
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //构建一个Configuration对象，用于管理这个程序所有配置，工作会定义很多自己的配置
        Configuration conf = new Configuration();
        //t通过Toolruner的run方法调用当前类的run方法
        int status = ToolRunner.run(conf, new MRFlow1(), args);
        //退出程序
        System.exit(status);
    }


    /**
     * @ClassName MRMapper
     * @Description TODO 这是MapReduce模板的Map类
     *      输入的KV类型：由inputformat决定，默认是TextInputFormat
     *      输出的KV类型：由map方法中谁作为key，谁作为Value决定
     */
    public static class MRMapper extends Mapper<LongWritable, Text, Text,FlowBean01> {

        private Text outputKey =  new Text();
        private FlowBean01 outputValue = new FlowBean01();

        /**
         * 一般用于实现对数据前期的过滤、转换的操作
         *              * 输出新的KeyValue
         *              * Key：手机号
         *              * Value：这条数据中的上行包、下行包、上行流量、下行流量
         */
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            //将每一行的数据进行分割
            String[] items = value.toString().split("\t");
            //进行合法性判断
            if(items.length >= 11){
                //通过计数器，记录有多少条合法的
                context.getCounter("UserGroup","legal record").increment(1L);
                //将手机号作为Key
                this.outputKey.set(items[1]);
                //将上行包、下行包、上行流量、下行流量作为value
                this.outputValue.setUpPack(Long.parseLong(items[6]));
                this.outputValue.setDownPack(Long.parseLong(items[7]));
                this.outputValue.setUpFlow(Long.parseLong(items[8]));
                this.outputValue.setDownFlow(Long.parseLong(items[9]));
                //输出
                context.write(this.outputKey,this.outputValue);
            }else{
                //通过计数器记录有多少个不合法的,计数器的结果可以在运行的日志中显示,这条代码执行一次就自增1
                context.getCounter("UserGroup","illegal record").increment(1L);
                //如果没有11个字段，记录总共有多少个，然后直接返回，取下一条
                return;
            }
        }
    }



    /**
     * @ClassName MRReducer
     * @Description TODO MapReduce模板的Reducer的类
     *      输入的KV类型：由Map的输出决定，保持一致
     *      输出的KV类型：由reduce方法中谁作为key，谁作为Value决定
     */
    public static class MRReducer extends Reducer<Text,FlowBean01,Text,FlowBean01> {

        private FlowBean01 outputValue = new FlowBean01();


        /**
         * 实现reduce处理的逻辑：用于实现分组后的聚合
         */
        @Override
        protected void reduce(Text key, Iterable<FlowBean01> values, Context context) throws IOException, InterruptedException {
            long sumUpPack = 0;
            long sumDownPack = 0;
            long sumUpFlow = 0;
            long sumDownFlow = 0;
            //迭代取出这个手机号所有的上网记录中的上行和下行的信息，累加即可
            for (FlowBean01 value : values) {
                sumUpPack += value.getUpPack();
                sumDownPack += value.getDownPack();
                sumUpFlow += value.getUpFlow();
                sumDownFlow += value.getDownFlow();
            }
            //将最后计算出的总的数据作为Value
            this.outputValue.setUpPack(sumUpPack);
            this.outputValue.setDownPack(sumDownPack);
            this.outputValue.setUpFlow(sumUpFlow);
            this.outputValue.setDownFlow(sumDownFlow);
            //输出结果
            context.write(key,this.outputValue);

        }
    }


}
