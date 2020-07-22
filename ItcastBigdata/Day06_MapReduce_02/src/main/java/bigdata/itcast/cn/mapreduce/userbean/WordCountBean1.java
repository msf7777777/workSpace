package bigdata.itcast.cn.mapreduce.userbean;

import com.sun.corba.se.spi.ior.Writeable;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @ClassName WordCountBean1
 * @Description TODO 实现封装单词和单词的长度的JavaBean，用于Hadoop中的KV
 * @Date 2020/5/30 15:29
 * @Create By     Frank
 */
public class WordCountBean1 implements WritableComparable<WordCountBean1> {

    //定义属性
    private String word;
    private int length;

    //构造
    public WordCountBean1(){

    }

    //统一的赋值方法
    public void setAll(String word,int length){
        this.setWord(word);
        this.setLength(length);
    }


    //get and set
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //序列化方法
    @Override
    public void write(DataOutput out) throws IOException {
        //将word进行序列化
        out.writeUTF(this.word);
        //将length进行徐丽华
        out.writeInt(this.length);
    }

    //反序列化：顺序必须与序列化的顺序是一致的
    @Override
    public void readFields(DataInput in) throws IOException {
        //读取word，进行反序列化
        this.word = in.readUTF();
        //读取length，进行反序列化
        this.length = in.readInt();
    }


    //toString方法：将对象打印成字符串
    @Override
    public String toString() {
        return word+"\t"+length;
    }

    /**
     * 如果自定义的类型作为Map输出的Key，需要在shuffle中 经过排序，就会调用这个方法来对这个类型排序
     *      * hadoop   4       1
     *      * hadoop   6       1
     *      * hbase    5       1
     *      * hive     4       1
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(WordCountBean1 o) {
        //先比较第一个属性，单词是否相等
        int comp = this.getWord().compareTo(o.getWord());
        if(comp == 0){
            //如果第一个属性相等，就比较第二个属性，第二个属性的比较结果作为最终的结果
            return Integer.valueOf(this.getLength()).compareTo(Integer.valueOf(o.getLength()));

        }else
            return comp;
    }
}
