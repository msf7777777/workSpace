package cn.itcast.task.task01_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
题目四
	请编写程序，从控制台接收一个“日期”
	格式：yyyy-MM-dd
	程序将其转换为：xxxx年xx月xx日的格式输出到控制台。
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日,格式为:");
        System.out.println("yyyy-MM-dd(1990-11-13)");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //1.输入一个日期
        String dateStr = scanner.next();
        //2.String格式化Date
        Date dateDate = dateFormat.parse(dateStr);
        System.out.println(dateDate);
        //3.Date格式化String(题目想要的)
        SimpleDateFormat dateFormatNew = new SimpleDateFormat("yyyy年MM月dd日这天出生");
        String dateStrNew = dateFormatNew.format(dateDate);
        //4.打印输出想要的日期(及格式)
        System.out.println(dateStrNew);
    }
}
