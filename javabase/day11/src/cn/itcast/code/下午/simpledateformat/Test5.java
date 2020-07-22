package cn.itcast.code.下午.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    求自己活了多少天
    1.键盘录入自己的出生年月日
 */
public class Test5 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入自己的出生年月日格式如:(yyyy-MM-dd)");
        String birthday = scanner.next();
        //1.现在的毫秒值
        Date date = new Date();
        long t1 = date.getTime();
        //2.求出生的时候的毫秒值 ----> 将出生的"字符串"变成date就可以得到毫秒值
        // 我们需要将String ---> Date 就需要我们SimpleDateFormat的parse方法
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);
        long t2 = birthdayDate.getTime();
        //3. 计算结果
        System.out.println((t1 - t2)/(1000L * 60*60*24) );


    }
}
