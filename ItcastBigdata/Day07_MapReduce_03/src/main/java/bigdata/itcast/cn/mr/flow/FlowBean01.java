package bigdata.itcast.cn.mr.flow;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @ClassName FlowBean01
 * @Description TODO Flow1程序中的自定义数据类型
 *  用于封装：上行包、下行包、上行流量、下行流量
 * @Date 2020/6/1 11:16
 * @Create By     Frank
 */
public class FlowBean01 implements Writable {

    //先定义属性
    private long upPack;
    private long downPack;
    private long upFlow;
    private long downFlow;

    public FlowBean01(){

    }

    //get  and set
    public long getUpPack() {
        return upPack;
    }

    public void setUpPack(long upPack) {
        this.upPack = upPack;
    }

    public long getDownPack() {
        return downPack;
    }

    public void setDownPack(long downPack) {
        this.downPack = downPack;
    }

    public long getUpFlow() {
        return upFlow;
    }

    public void setUpFlow(long upFlow) {
        this.upFlow = upFlow;
    }

    public long getDownFlow() {
        return downFlow;
    }

    public void setDownFlow(long downFlow) {
        this.downFlow = downFlow;
    }

    //序列化
    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(this.upPack);
        out.writeLong(this.downPack);
        out.writeLong(this.upFlow);
        out.writeLong(this.downFlow);
    }

    //反序列化
    @Override
    public void readFields(DataInput in) throws IOException {
        this.upPack = in.readLong();
        this.downPack = in.readLong();
        this.upFlow = in.readLong();
        this.downFlow = in.readLong();
    }

    //toString方法，output阶段会调用该方法写入文件
    @Override
    public String toString() {
        return upPack+"\t"+downPack+"\t"+upFlow+"\t"+downFlow;
    }
}
