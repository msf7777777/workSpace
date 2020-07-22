package cn.itcast.code.下午.date;

import java.util.Date;

public class Test2 {

    public static void main(String[] args) {
        // 想要代表1970年1月2号的8点
        Date date = new Date(1000 * 60 * 60 * 24);
        System.out.println(date);
        //要代表1980年1月1号的8点 ---> 这个参数要的是一个long类型的数据,
        //我们如果传入的都是int的话, 有可能超过int的范围, 损失精度
        Date date1 = new Date(1000L * 60 * 60 * 24 * 365 * 10);
        System.out.println(date1);
        // 距离时间原点是正数的话, 是1970以后的
        //距离时间原点是负数的话, 是1970以前的
    }
}
