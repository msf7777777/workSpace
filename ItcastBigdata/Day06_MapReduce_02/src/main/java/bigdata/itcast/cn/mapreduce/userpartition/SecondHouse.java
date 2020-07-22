package bigdata.itcast.cn.mapreduce.userpartition;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
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
 * @ClassName SecondHouseDriver
 * @Description TODO 实现各地区的二手房的个数统计
 * @Date 2020/5/29 16:29
 * @Create By     Frank
 */
public class SecondHouse extends Configured implements Tool {

    @Override
    public int run(String[] args) throws Exception {
        //todo:1-构建Job对象
        Job job = Job.getInstance(this.getConf(),"secondhouse");
        job.setJarByClass(SecondHouse.class);
        //todo:2-配置job
        Path inputPath = new Path("datas/lianjia/secondhouse.csv");
        TextInputFormat.setInputPaths(job,inputPath);

        job.setMapperClass(SecondMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        //shuffle阶段：干预分区方式
        job.setPartitionerClass(UserPartition.class);


        job.setReducerClass(SecondReduce.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        job.setNumReduceTasks(2);


        Path outputPath = new Path("datas/lianjia/output3");
        //构建一个HDFS的文件系统
        FileSystem hdfs = FileSystem.get(this.getConf());
        //判断输出目录是否存在，如果存在就删除
        if(hdfs.exists(outputPath)){
            hdfs.delete(outputPath,true);
        }
        TextOutputFormat.setOutputPath(job,outputPath);
        //todo:3-提交job
        return job.waitForCompletion(true) ? 0:-1;
    }

    public static void main(String[] args) throws Exception {
        //构建configuration对象
        Configuration conf = new Configuration();
        int status = ToolRunner.run(conf, new SecondHouse(), args);
        System.exit(status);
    }


    /**
     * 这是Mapper类，写在一个文件中，必须定义为static
     */
    public static class SecondMapper extends Mapper<LongWritable, Text,Text, IntWritable>{

        Text outputKey = new Text();
        IntWritable outputValue = new IntWritable(1);

        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            //将每一条二手房信息中对应的地区取出，作为key
            String region = value.toString().split(",")[3];
            //设置地区作为key
            this.outputKey.set(region);
            //直接输出这个地区出现一套二手房
            context.write(this.outputKey,this.outputValue);

        }
    }


    public static class SecondReduce extends Reducer<Text, IntWritable,Text, IntWritable>{

        IntWritable outputValue = new IntWritable();

        @Override
        protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

            int sum = 0;
            //对每个地区的所有二手房的个数累加
            for (IntWritable value : values) {
                sum += value.get();
            }
            //将sum作为value
            this.outputValue.set(sum);
            //输出
            context.write(key,this.outputValue);

        }
    }

}
