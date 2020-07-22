package bigdata.itcast.cn.mapreduce.wc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * @ClassName WordCountDriver
 * @Description TODO 实现Wordcount程序的Driver类
 * 1-包含程序的入口，main
 * 2-必须构建一个 MapReduce的job，配置job，提交运行job
 * @Date 2020/5/29 15:29
 * @Create By     Frank
 */
public class WordCountDriver extends Configured implements Tool {

    /**
     *-必须构建一个 MapReduce的job，配置job，提交运行job
     * @param args
     * @return
     * @throws Exception
     */
    @Override
    public int run(String[] args) throws Exception {
        //todo:1-构建一个MapReduce的job对象
        Job job = Job.getInstance(this.getConf(),"userwc");//第一个参数是conf对象，第二个程序的名字
        //设置可运行的类
        job.setJarByClass(WordCountDriver.class);

        //todo:2-配置这个job的五个阶段
        //配置输入
        Path inputPath = new Path(args[0]);//这里不写死，通过参数的形式来传递，用程序的第一个参数来代表输入的路径
        TextInputFormat.setInputPaths(job,inputPath);//为当前job设置输入读取的HDFS的路径
        //配置Map
        job.setMapperClass(WordCountMapper.class);//指定Mapper的类
        job.setMapOutputKeyClass(Text.class);//指定Map输出的key的类型
        job.setMapOutputValueClass(IntWritable.class);//指定Map输出的Value的类型

        //配置shuffle：Shuffle我们不干预，使用默认的

        //配置reduce
        job.setReducerClass(WordCountReducer.class);//指定Reduce的类
        job.setOutputKeyClass(Text.class);//指定Reduce输出的key的类型
        job.setOutputValueClass(IntWritable.class);//指定Reduce输出的Value的类型

        //配置输出
        Path outputPath = new Path(args[1]);//这里不写死，通过参数的形式来传递，用程序的第二个参数来代表输出的路径
        TextOutputFormat.setOutputPath(job,outputPath);//为当前的job设置输出的路径，结果保存的路径

        //todo:3-提交这个job的运行
        return job.waitForCompletion(true) ? 0 : -1;
    }

    /**
     * 负责调用run方法
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //第一个参数：Configuration对象，所有Hadoop程序都需要的
        Configuration conf = new Configuration();
        //第二个参数：tool对象，你要调用哪个对象的run方法
        //第三个参数：将args数组传递过去
        int status = ToolRunner.run(conf, new WordCountDriver(), args);
        //在run方法中会提交程序运行，返回运行的结果，如果运行结果为0.就正常退出
        System.exit(status);
    }

}
