package cn.itcast.task;

import java.util.Scanner;

/*
8 题目八
	键盘录入5个字符串存入数组中.
	将数组中包含数字的元素打印到控制台上
 */
public class Test08_new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.创建字符串数组
        String[] arr= new String[5];
        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数组的第" + (i + 1) + "个字符串");
            arr[i] = scanner.next();
        }
        //3.遍历数组中每一个元素的字符串的数字
        for (int i = 0; i < arr.length; i++) {
            //3.1.创建计数器来统计字符串元素中是否包含数字
            int count= 0;
            //3.2.创建String类型数据接收数组元素
            String yuanSu = arr[i];
            //3.3.遍历字符串,拿到每一个字符
            for (int j = 0; j < yuanSu.length(); j++) {
                //3.3.1.创建char类型数据接收数组元素的字符
                int a;//消除波浪,不用管
                char ziFu = yuanSu.charAt(j);
                //3.3.2.判断字符中是否包含数字
                if(ziFu >= '0' && ziFu <= '9'){
                    count++;
                    break;
                }
            }
            //3.4.判断count是否>0
            if(count > 0){
                System.out.println(yuanSu);
            }
        }
    }
}
