package cn.itcast.task;

import java.util.Scanner;

/*
1.3 题目三
	请定义main()方法，在main()中按以下顺序要求编写代码：
	分别从控制台接收两个整数
	计算“第一个数 / 第二个数”的结果，并打印；
	为了防止第二个数为0导致异常，请在计算时使用异常处理。
	当出现异常时，向用户打印：第二个数不能为0！！

 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字a");
        int a = scanner.nextInt();
        System.out.println("输入第二个数字b");
        int b = scanner.nextInt();
        int result;
        try {
            result = a / b;
            System.out.println("a / b = " +  result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fuck off!第二个数不能为0！！");
        }

    }
}
