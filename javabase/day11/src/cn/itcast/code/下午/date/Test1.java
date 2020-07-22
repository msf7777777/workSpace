package cn.itcast.code.下午.date;

import java.util.Date;

public class Test1 {
    /*
        Date() ; 作用: 代表当前系统时间
		Date(long date) ; 作用: 代表指定时间
     */
    public static void main(String[] args) {
        //   Date() ; 作用: 代表当前系统时间
        Date date = new Date();
        System.out.println(date);
        // Date(long date) ; 作用: 代表指定时间
        Date date1 = new Date(2000);
        System.out.println(date1);
    }
}
