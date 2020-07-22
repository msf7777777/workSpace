package cn.itcast.bigdata.mapreduce.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * KEYIN,VALUEIN,KEYOUT,VALUEOUT
 * Reduce输入的Key和Value类型 = Map阶段输出的Key和Value的类型
 * Reduce输出的Key和Value类型 = 最后结果的类型
 * @ClassName WordCountReducer
 * @Description TODO 实现Wordcount程序的MReducer类
 * @Date 2020/5/29 16:09
 * @Create By     Frank
 */
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {


}
