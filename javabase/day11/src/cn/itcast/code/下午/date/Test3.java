package cn.itcast.code.下午.date;

import java.util.Date;

public class Test3 {

    public static void main(String[] args) {
        //我想表示明天的这个时候 ----> 得到今天的+ 24小时的毫秒值
        Date date = new Date();//空参构造就是代表当前时间
        long time = date.getTime();
        System.out.println(time);
        //将今天的毫秒值+ 上现在的毫秒值
        time += 1000L * 60*60*24;
        System.out.println(date);
        //将新的毫秒值设置回去
        date.setTime(time);
        System.out.println(date);

    }
}
