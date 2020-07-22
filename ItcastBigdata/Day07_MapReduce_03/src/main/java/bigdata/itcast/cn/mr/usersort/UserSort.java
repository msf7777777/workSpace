package bigdata.itcast.cn.mr.usersort;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

/**
 * @ClassName UserSort
 * @Description TODO 用于自定义的排序器：就是提供一个比较器的方法
 * @Date 2020/6/1 10:22
 * @Create By     Frank
 */
public class UserSort extends WritableComparator {

    /**
     * 允许将Text类型强转为WritableComparable类型
     * 注册
     */
    public UserSort(){
        super(Text.class,true);
    }


    /**
     * 将两个WritableComparable的对象 进行比较
     * @param a
     * @param b
     * @return
     */
    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        //将两个对象，转为我们需要比较的对象类型
        Text o1 = (Text) a;
        Text o2 = (Text) b;
        //默认是升序，需求是降序
        return -o1.compareTo(o2);
    }
}
