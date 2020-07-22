package cn.itcast.bigdata.mapreduce.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * KEYIN, VALUEIN, KEYOUT, VALUEOUT
 * Map输入的Key和Value类型
 * Map输出的Key和Value类型
 *
 * @ClassName WordCountMapper
 * @Description TODO 实现Wordcount程序的Mapper类
 * @Date 2020/5/29 15:48
 * @Create By     Frank
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    //定义输出的Key
    Text outputKey = new Text();
    //定义输出的Value
    IntWritable outputValue = new IntWritable(1);


    /**
     * Input阶段传递进来的每一个KeyValue都会调用一次map方法
     * @param key：这条数据中的key：行的偏移量
     * @param value：这条数据中的value：行的内容
     * @param context：上下文对象 ，用于输出的
     * @throws IOException
     * @throws InterruptedException
     */
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        //对这一行的内容，进行分割，得到每个单词
        String[] words = value.toString().split(" ");
        //遍历得到每个单词
        for (String word : words) {
            //将单词封装成Key
            this.outputKey.set(word);
            //输出这个单词和1
            context.write(this.outputKey, this.outputValue);
        }
    }
}
