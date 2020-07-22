package bigdata.itcast.cn.mapreduce.model;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @ClassName MRReducer
 * @Description TODO MapReduce模板的Reducer的类
 *      输入的KV类型：由Map的输出决定，保持一致
 *      输出的KV类型：由reduce方法中谁作为key，谁作为Value决定
 * @Date 2020/5/30 11:25
 * @Create By     Frank
 */
public class MRReducer extends Reducer<NullWritable,NullWritable,NullWritable,NullWritable> {
    @Override
    protected void reduce(NullWritable key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {

        /**
         * 实现reduce处理的逻辑
         */
    }
}
