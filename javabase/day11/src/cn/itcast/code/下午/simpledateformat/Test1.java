package cn.itcast.code.下午.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    /*
        SimpleDateFormat()(不会用, 因为默认提供过的模式太难看了)
        SimpleDateFormat(String pattern)
     */
    public static void main(String[] args) {
        // 需要定义日期格式化对象, 这个对象中我们用户就可以指定自己喜欢的格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        //存在的价值,就是让 date变成好看的字符串
        //String format(Date date)
        String str = sdf.format(new Date());
        System.out.println(str);

        // 让字符串变回日期

    }
}
