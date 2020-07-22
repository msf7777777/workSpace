package cn.itcast.practice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 自己活了多少天 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入自己的出生年月日,格式:");
        String birthdayStr = scanner.next();

        SimpleDateFormat birthdaySdf = new SimpleDateFormat("yyyy-mm-dd");
        Date birthdayDate = birthdaySdf.parse(birthdayStr);
        System.out.println(birthdayDate);

    }
}
