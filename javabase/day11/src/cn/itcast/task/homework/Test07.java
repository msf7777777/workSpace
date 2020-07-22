package cn.itcast.task.homework;

import java.util.Scanner;

/*
7 题目七
	键盘录入5个字符串存入数组中.
	将数组中的元素都变成大写并反转,然后拼接成一个字符串输出到控制台上
 */
public class Test07 {

    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        //创建字符串数组
        String[] strArray = new String[5];
        //循环输入5个字符串
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个字符串");
            //接收字符串
            strArray[i] = scanner.next();
        }
        //将数组中的元素都变成大写并反转
        for (int i = 0; i < strArray.length; i++) {
           /* String s = strArray[i];
            s = s.toUpperCase();
            // 将s变成sb然后调用reverse() ---->通过sb的构造
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            //将sb --> string  ----> toString
            String newStr = sb.toString();
            //将新的字符串在设置回去
            strArray[i] = newStr;*/
           strArray[i] = new StringBuilder(strArray[i].toUpperCase()).reverse().toString();
        }
        //然后拼接成一个字符串输出到控制台上
        StringBuilder sb = new StringBuilder();
        //遍历数组
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("麻少飞真帅");
            sb.append(strArray[i]);
        }
        System.out.println(sb);


    }
}
