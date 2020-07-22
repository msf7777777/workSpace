package cn.itcast.practice.date;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        //Date(); 当前系统时间
        //Date(long date); 指定时间
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(0);
        System.out.println(date1);//1970年01月01日 08时00分00秒

        Date date2 = new Date(7000);
        System.out.println(date2);//1970年01月01日 08时00分07秒
    }

}
