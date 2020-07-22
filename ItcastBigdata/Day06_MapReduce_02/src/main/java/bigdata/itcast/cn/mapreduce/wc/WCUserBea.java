package bigdata.itcast.cn.mapreduce.wc;

import bigdata.itcast.cn.mapreduce.userbean.WordCountBean1;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
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
 * @ClassName WCDriver
 * @Description TODO 实现WordCount,结果有三列
 * 单词   长度  个数
 * hadoop	6	4
 * hbase	5	3
 * hive	4	2
 * spark	5	1
 *
 * @Date 2020/5/30 11:30
 * @Create By     Frank
 */
public class WCUserBea extends Configured implements Tool {
    @Override
    public int run(String[] args) throws Exception {
        //创建一个job
        Job job = Job.getInstance(this.getConf(),"wctest");
        job.setJarByClass(WCUserBea.class);

        //配置job
        Path inputPath = new Path("datas/wordcount/input");
        TextInputFormat.setInputPaths(job,inputPath);

        job.setMapperClass(WCMapper.class);
        job.setMapOutputKeyClass(WordCountBean1.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setReducerClass(WCReducer.class);
        job.setOutputKeyClass(WordCountBean1.class);
        job.setOutputValueClass(IntWritable.class);


        Path outputPath = new Path("datas/output/wordcount/output5");
        TextOutputFormat.setOutputPath(job,outputPath);

        //提交运行
        boolean result = job.waitForCompletion(true);
        return result ? 0 : -1;
    }

    public static void main(String[] args) throws Exception {
        //构建一个Configuration
        Configuration conf = new Configuration();
        //调用当前类的run方法
        int status = ToolRunner.run(conf, new WCUserBea(), args);
        //退出
        System.exit(status);
    }


    public static class WCMapper extends Mapper<LongWritable, Text, WordCountBean1, IntWritable>{

        WordCountBean1 outputKey  = new WordCountBean1();
        IntWritable outputValue = new IntWritable(1);

        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

            //从value中取出整行，并分割，得到每个单词
            String[] words = value.toString().split(" ");
            //将每个单词取出
            for (String word : words) {
                //将单词作为key，value恒为1
                this.outputKey.setWord(word);
                this.outputKey.setLength(word.length());
                //输出
                context.write(this.outputKey,this.outputValue);
                //输出2：不建议这么做，每条数据会调用一次map方法，会导致创建非常多的对象
//                context.write(new Text(word),new IntWritable(1));
        }
        }
    }

    public static class WCReducer extends Reducer<WordCountBean1, IntWritable,WordCountBean1, IntWritable>{
//        Text outputKey = new Text();
        IntWritable outputValue = new IntWritable();

        @Override
        protected void reduce(WordCountBean1 key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

            int sum = 0;
            //将当前单词出现的所有次数累加
            for (IntWritable value : values) {
                sum += value.get();
            }
            //将最后累加的个数作为value
            this.outputValue.set(sum);
            //输出
            context.write(key,this.outputValue);
        }
    }

}
