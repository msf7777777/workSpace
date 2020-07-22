package cn.itcast.task;

import java.util.Scanner;

/*
8 题目八
	键盘录入5个字符串存入数组中.
	将数组中包含数字的元素打印到控制台上
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + ( i+ 1) + "个字符串");
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                char a = arr[i].charAt(j);
                if(a <= 9 && a >= 0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
