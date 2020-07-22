package bigdata.itcast.cn.mapreduce.model;

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
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.IOException;

/**
 * @ClassName MRDriver
 * @Description TODO 这是MapReduce程序的Driver类的模板
 *      为什么要继承这个类，实现这个接口？
 *          Tool：工具类，为你封装了run方法，专门用于构建、配置、提交job
 *          Configured：得到getconf和setconf方法
 *      不这么做行不行？
 *          可以的
 *          如果不这么做，你就会将所有的代码写入main方法，这样非常不利用代码的规范性
 *          一个方法的代码不建议超过一屏
 * @Date 2020/5/30 10:34
 * @Create By     Frank
 */
public class MRDriver extends Configured implements Tool {

    /**
     * 用于将Job的代码封装
     * @param args
     * @return
     * @throws Exception
     */
    @Override
    public int run(String[] args) throws Exception {
        //todo:1-构建一个Job
        Job job = Job.getInstance(this.getConf(),"model");//构建Job对象，调用父类的getconf获取属性的配置
        job.setJarByClass(MRDriver.class);//指定可以运行的类型
        //todo:2-配置这个Job
        //input
//        job.setInputFormatClass(TextInputFormat.class);//设置输入的类的类型，默认就是TextInputFormat
        Path inputPath1 = new Path(args[0]);//用程序的第一个参数做为第一个输入路径
        Path inputPath2 = new Path(args[1]);//用程序的第二个参数作为第二个输入路径
        //设置的路径可以给目录，也可以给定文件，如果给定目录，会将目录中所有文件作为输入，但是目录中不能包含子目录
        TextInputFormat.setInputPaths(job,inputPath1,inputPath2);//为当前job设置输入的路径

        //map
        job.setMapperClass(MRMapper.class);//设置Mapper的类，需要调用对应的map方法
        job.setMapOutputKeyClass(NullWritable.class);//设置Mapper输出的key类型
        job.setMapOutputValueClass(NullWritable.class);//设置Mapper输出的value类型

        //shuffle
//        job.setPartitionerClass(HashPartitioner.class);//自定义分区
//        job.setGroupingComparatorClass(null);//自定义分组的方式
//        job.setSortComparatorClass(null);//自定义排序的方式

        //reduce
        job.setReducerClass(MRReducer.class);//设置Reduce的类，需要调用对应的reduce方法
        job.setOutputKeyClass(NullWritable.class);//设置Reduce输出的Key类型
        job.setOutputValueClass(NullWritable.class);//设置Reduce输出的Value类型
        job.setNumReduceTasks(1);//设置ReduceTask的个数，默认为1

        //output：输出目录默认不能提前存在
//        job.setOutputFormatClass(TextOutputFormat.class);//设置输出的类，默认我诶TextOutputFormat
        Path outputPath = new Path(args[2]);//用程序的第三个参数作为输出
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
        int status = ToolRunner.run(conf, new MRDriver(), args);
        //退出程序
        System.exit(status);
    }


    /**
     * @ClassName MRMapper
     * @Description TODO 这是MapReduce模板的Map类
     *      输入的KV类型：由inputformat决定，默认是TextInputFormat
     *      输出的KV类型：由map方法中谁作为key，谁作为Value决定
     */
    public static class MRMapper extends Mapper<LongWritable, Text, NullWritable,NullWritable> {
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            /**
             * 这里实现Map处理的逻辑
             */
        }
    }



    /**
     * @ClassName MRReducer
     * @Description TODO MapReduce模板的Reducer的类
     *      输入的KV类型：由Map的输出决定，保持一致
     *      输出的KV类型：由reduce方法中谁作为key，谁作为Value决定
     */
    public static class MRReducer extends Reducer<NullWritable,NullWritable,NullWritable,NullWritable> {
        @Override
        protected void reduce(NullWritable key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {

            /**
             * 实现reduce处理的逻辑
             */
        }
    }


}
