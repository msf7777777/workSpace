package bigdata.itcast.cn.mr.flow;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * @ClassName UsesrFlowPartition
 * @Description TODO 自定义分区，根据手机号的头部进行分区
 * @Date 2020/6/1 14:31
 * @Create By     Frank
 */
public class UsesrFlowPartition extends Partitioner<Text,FlowBean01> {

    /**
     * 返回每条数据的分区编号
     * @param key：手机号
     * @param value：上行和下行的总值信息
     * @param numPartitions：Reduce个数
     * @return
     */
    @Override
    public int getPartition(Text key, FlowBean01 value, int numPartitions) {
        //获取手机号
        String phone = key.toString();
        //判断手机号的开头返回对应的分区编号
        if(phone.startsWith("135")){
            return 0;
        }else if (phone.startsWith("136")){
            return 1;
        }else if (phone.startsWith("137")){
            return 2;
        }else{
            return 3;
        }
    }
}
