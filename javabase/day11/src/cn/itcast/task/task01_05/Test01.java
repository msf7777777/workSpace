package cn.itcast.task.task01_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
题目一
	请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
	注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
 */
public class Test01 {
    public static void main(String[] args) throws ParseException {
        Scanner scnner = new Scanner(System.in);
        System.out.println("请输入您的生日,格式为:yyyy-MM-dd(1990-11-13)");
        //1.得到一个年月日标准格式的字符串
        String birthdayStr = scnner.next();
            //导包SimpleDateFormat
        SimpleDateFormat birthdaySdf = new SimpleDateFormat("yyyy-MM-dd");
            //字符串转换Date格式
        Date birthdayDate = birthdaySdf.parse(birthdayStr);
        //2.计算现在的毫秒值
        Date dateNow = new Date();
        long nowTime = dateNow.getTime();
        //3.计算出生日期的毫秒值
        long birthdayTime = birthdayDate.getTime();
        //4.计算出生到现在的天数
        long lifeTimeDay = (nowTime - birthdayTime) / (1000L * 60 * 60 * 24);
        if(lifeTimeDay > 0){
            System.out.println("下面是你存活的天数");
            System.out.println(lifeTimeDay);
        }else{
            System.out.println("fuck off");
        }


    }
}
