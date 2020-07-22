package cn.itcast.task.task01_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
题目二
	请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，程序要能够计算并打印：第一个生日大于/小于第二个生日。
	注意：要求验证生日日期必须早于当前日期
 */
public class Test02 {
    public static void main(String[] args) throws ParseException {
        Scanner scnner = new Scanner(System.in);
        //1.得到一个年月日标准格式的字符串
        System.out.println("请输入您的生日");
        System.out.println("格式为:yyyy-MM-dd(1990-11-13");
        String birthdayStrY = scnner.next();
        System.out.println("请输入您对象的生日");
        System.out.println("格式为:yyyy-MM-dd(1996-01-22)");
        String birthdayStrH = scnner.next();
        //导包SimpleDateFormat
        SimpleDateFormat birthdaySdfY = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat birthdaySdfH = new SimpleDateFormat("yyyy年MM月dd日");
        //字符串转换Date格式
        Date birthdayDateY = birthdaySdfY.parse(birthdayStrY);
        Date birthdayDateH = birthdaySdfH.parse(birthdayStrH);
        //3.计算出生日期的毫秒值
        long birthdayTimeY = birthdayDateY.getTime();
        long birthdayTimeH = birthdayDateH.getTime();
        //4.计算出现在的毫秒值
        Date date = new Date();
        long dateTimeNow = date.getTime();
        //5.你和她/他存活的天数
        System.out.print((dateTimeNow - birthdayTimeY) / (1000L * 60 * 60 * 24));//你的 存活天数
        System.out.println("  你的 存活天数:");
        System.out.print((dateTimeNow - birthdayTimeH) / (1000L * 60 * 60 * 24));//她/他的 存活天数
        System.out.println("  她/他的 存活天数:");
        //6.比较得出结果
        if(birthdayTimeY > dateTimeNow && birthdayTimeH > dateTimeNow){
            System.out.println("fuck off");
        }else{
            //相反逻辑,如果生日距离元年1970越近,则天数越小,则生日越大
            if(birthdayTimeY < birthdayTimeH){
                System.out.println("你的生日 大于 她/他的生日");
                System.out.println(birthdayDateY + " > " + birthdayDateH);
            }else if(birthdayTimeY > birthdayTimeH){
                System.out.println("你的生日 小于 她/他的生日");
                System.out.println(birthdayDateY + " < " + birthdayDateH);
            }else{
                System.out.println("鹅~那个~能再具体到时分秒吗?");
            }
        }
    }
}
