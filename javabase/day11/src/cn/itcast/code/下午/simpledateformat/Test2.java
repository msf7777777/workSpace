package cn.itcast.code.下午.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        //使用有参构造得到一个好看的模式
        /*
            yyyy: 4个小姨
            MM: 2个大美眉
            dd: 2个小dd
            HH: 2个大H
            mm: 2个小美眉
            ss: 2个小s
         */
        //"yyyy年MM月dd日 HH:mm:ss"    "yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();//当前时间
        String str = sdf.format(date);//将时间对象传入方法中, 得到字符串表现形式
        System.out.println(str);
    }
}
