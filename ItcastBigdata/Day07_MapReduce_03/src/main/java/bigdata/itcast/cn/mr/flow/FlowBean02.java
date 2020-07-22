package bigdata.itcast.cn.mr.flow;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @ClassName FlowBean01
 * @Description TODO 用于封装Flow01的结果
 *  用于封装：手机号、上行总包、下行总包、上行总流量、下行总流量
 * @Date 2020/6/1 11:16
 * @Create By     Frank
 */
public class FlowBean02 implements WritableComparable<FlowBean02> {

    //先定义属性
    private String phone;
    private long upPack;
    private long downPack;
    private long upFlow;
    private long downFlow;

    public FlowBean02(){

    }

    //get  and set

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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
        out.writeUTF(this.phone);
        out.writeLong(this.upPack);
        out.writeLong(this.downPack);
        out.writeLong(this.upFlow);
        out.writeLong(this.downFlow);
    }

    //反序列化
    @Override
    public void readFields(DataInput in) throws IOException {
        this.phone = in.readUTF();
        this.upPack = in.readLong();
        this.downPack = in.readLong();
        this.upFlow = in.readLong();
        this.downFlow = in.readLong();
    }

    //toString方法，output阶段会调用该方法写入文件
    @Override
    public String toString() {
        return phone+"\t"+upPack+"\t"+downPack+"\t"+upFlow+"\t"+downFlow;
    }

    /**
     * 对于这个类型在Shuffle中的排序，按照上行流量降序
     * @param o
     * @return
     */
    @Override
    public int compareTo(FlowBean02 o) {
        //只按照上行总流量降序排序即可
        return -Long.valueOf(this.getUpFlow()).compareTo(Long.valueOf(o.getUpFlow()));
    }
}
