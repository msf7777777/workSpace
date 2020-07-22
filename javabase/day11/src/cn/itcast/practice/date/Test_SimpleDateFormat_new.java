package cn.itcast.practice.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_SimpleDateFormat_new {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("第 一 次打印");
        System.out.println(date);

        SimpleDateFormat sdf2 = new SimpleDateFormat();
        String str2 = sdf2.format(date);
        System.out.println("第 二 次打印");
        System.out.println(str2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        System.out.println("第 三 次打印");
        System.out.println(str);


    }
}
