package bigdata.itcast.cn.mapreduce.wc;

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
 * @Description TODO 实现WordCount
 * @Date 2020/5/30 11:30
 * @Create By     Frank
 */
public class WCDriver extends Configured implements Tool {
    @Override
    public int run(String[] args) throws Exception {
        //创建一个job
        Job job = Job.getInstance(this.getConf(),"wctest");
        job.setJarByClass(WCDriver.class);

        //配置job
        Path inputPath = new Path("datas/wordcount/input");
        TextInputFormat.setInputPaths(job,inputPath);

        job.setMapperClass(WCMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setReducerClass(WCReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        job.setNumReduceTasks(2);


        Path outputPath = new Path("datas/output/wordcount/output2");
        TextOutputFormat.setOutputPath(job,outputPath);

        //提交运行
        boolean result = job.waitForCompletion(true);
        return result ? 0 : -1;
    }

    public static void main(String[] args) throws Exception {
        //构建一个Configuration
        Configuration conf = new Configuration();
        //调用当前类的run方法
        int status = ToolRunner.run(conf, new WCDriver(), args);
        //退出
        System.exit(status);
    }


    public static class WCMapper extends Mapper<LongWritable, Text,Text, IntWritable>{

        Text outputKey  = new Text();
        IntWritable outputValue = new IntWritable(1);


        /**
         * Input阶段的每一个Keyvalue都调用一次map方法 来处理
         * k				v
         * 0				hadoop  hive  hadoop
         * 100				hbase  hive  hive
         * @param key
         * @param value
         * @param context
         * @throws IOException
         * @throws InterruptedException
         */
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            /**
             * hadoop		1
             * hive		1
             * hadoop		1
             * hbase		1
             * hive		1
             * hive		1
             */
            //从value中取出整行，并分割，得到每个单词
            String[] words = value.toString().split(" ");
            //将每个单词取出
            for (String word : words) {
                //将单词作为key，value恒为1
                this.outputKey.set(word);
                //输出
                context.write(this.outputKey,this.outputValue);
                //输出2：不建议这么做，每条数据会调用一次map方法，会导致创建非常多的对象
//                context.write(new Text(word),new IntWritable(1));
        }
        }
    }

    public static class WCReducer extends Reducer<Text, IntWritable,Text, IntWritable>{

        IntWritable outputValue = new IntWritable();

        /**
         * hadoop		{1,1}
         * hbase		{1}
         * hive		{1,1,1}
         * @param key
         * @param values
         * @param context
         * @throws IOException
         * @throws InterruptedException
         */
        @Override
        protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

            /**
             * hadoop		2
             * hbase		1
             * hive		3
             */
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
