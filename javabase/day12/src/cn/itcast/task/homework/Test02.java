package cn.itcast.task.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
题目二
	请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，
	程序要能够计算并打印：第一个生日大于/小于第二个生日。
	注意：要求验证生日日期必须早于当前日期
*/
public class Test02 {
    public static void main(String[] args) throws ParseException {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        System.out.println("请输入第一个生日【格式：yyyy年MM月dd日】");
        //接收键盘生日1数据
        String birthday1 = scanner.next();
        //提取生日1毫秒数
        long longBirthday1 = sdf.parse(birthday1).getTime();

        System.out.println("请输入第二个生日【格式：yyyy年MM月dd日】");
        //接收键盘生日2数据
        String birthday2 = scanner.next();
        //提取生日12毫秒数
        long longBirthday2 = sdf.parse(birthday2).getTime();

        //提取今天的毫秒数（不需要时分秒）
        long longToday = sdf.parse(sdf.format(new Date())).getTime();

        //判断输入有效性
        if (longToday <= longBirthday1) {
            System.out.println("第一个生日必须早于当前日期！");
        } else if (longToday <= longBirthday2) {
            System.out.println("第二个生日必须早于当前日期！");
        } else {
            //比较两个生日的大小
            if (longBirthday1 > longBirthday2) {
                System.out.println("第一个生日大于第二个生日");
            } else if (longBirthday1 == longBirthday2) {
                System.out.println("第一个生日和第二个生日一样的");
            } else {
                System.out.println("第一个生日小于第二个生日");
            }
        }
    }
}
