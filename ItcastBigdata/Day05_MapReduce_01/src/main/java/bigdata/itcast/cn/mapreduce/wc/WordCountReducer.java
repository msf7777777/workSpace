package bigdata.itcast.cn.mapreduce.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * KEYIN,VALUEIN,KEYOUT,VALUEOUT
 * Reduce输入的Key和Value类型 = Map阶段输出的Key和Value的类型
 * Reduce输出的Key和Value类型 = 最后结果的类型
 * @ClassName WordCountReducer
 * @Description TODO 实现Wordcount程序的MReducer类
 * @Date 2020/5/29 16:09
 * @Create By     Frank
 */
public class WordCountReducer extends Reducer<Text,IntWritable,Text,IntWritable> {

    IntWritable outputValue = new IntWritable();

    /**
     * shuffle输出的每一个KeyValue都会调用一次reduce方法
     * @param key：shuffle分组排序以后的每个key
     * @param values：这个key对应的value的迭代器结合
     * @param context
     * @throws IOException
     * @throws InterruptedException
     */
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        int sum = 0;
        //从迭代器中取出这个key的每一个value
        for (IntWritable value : values) {
            sum += value.get();
        }
        //key不变，sum作为新的value输出
        this.outputValue.set(sum);
        context.write(key,this.outputValue);
    }
}
