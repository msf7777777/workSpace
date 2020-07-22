package cn.itcast.practice.date;

import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        Date date= new Date();
        long timeNow = date.getTime();
        System.out.println(timeNow);
        long timeLast = timeNow + 1000L * 60 * 60 * 24;
        System.out.println(date);
        date.setTime(timeLast);
        System.out.println(date);
    }
}
