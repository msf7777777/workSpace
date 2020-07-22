package cn.itcast.practice.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_SimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat();
        String timeNow = format.format(new Date());
        System.out.println(timeNow);//无参默认格式:20-3-30 下午3:41

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String shengRi = format2.format(date);
        System.out.println(shengRi);//有参自定义格式一: yyyy年MM月dd日 HH:mm:ss --- 2020年03月30日 15:54:47
                                    //有参自定义格式二: yyyy-MM-dd HH:mm:ss ------- 2020-03-30 15:54:47
    }
}
