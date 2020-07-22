package bigdata.itcast.cn.mapreduce.model;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @ClassName MRMapper
 * @Description TODO 这是MapReduce模板的Map类
 *      输入的KV类型：由inputformat决定，默认是TextInputFormat
 *      输出的KV类型：由map方法中谁作为key，谁作为Value决定
 * @Date 2020/5/30 11:22
 * @Create By     Frank
 */
public class MRMapper extends Mapper<LongWritable, Text, NullWritable,NullWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        /**
         * 这里实现Map处理的逻辑
         */
    }
}
