package bigdata.itcast.cn.mapreduce.userpartition;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * @ClassName UserPartition
 * @Description TODO  用户自定义的分区类
 * 这里给定的KV的类型是Map的输出类型，分区发生在Map输出以后
 * 对Map输出的数据进行分区
 * @Date 2020/5/30 14:42
 * @Create By     Frank
 */
public class UserPartition extends Partitioner<Text, IntWritable> {

    /**
     * Map输出的每一条数据都会调用这个方法，来得到自己的分区编号
     * @param key：当前的key
     * @param value：当前的value
     * @param numPartitions：其实就是Reduce的个数,2，要么返回0，要么返回1
     * @return
     */
    @Override
    public int getPartition(Text key, IntWritable value, int numPartitions) {
        //key就是地区，判断这个地区是不是浦东，如果是浦东，就返回0，非浦东，返回1
        String region = key.toString();
        if(region.equals("浦东")){
            return 0;
        }else
            return 1;
    }
}
