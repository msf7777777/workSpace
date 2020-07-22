package cn.itcast.task.homework.test03;

import java.util.Scanner;

/*
1.3 题目三
	请定义main()方法，在main()中按以下顺序要求编写代码：
	分别从控制台接收两个整数
	计算“第一个数 / 第二个数”的结果，并打印；
	为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！！
 */
public class Test01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被除数");
        int number = scanner.nextInt();
        System.out.println("请输入除数");
        int number1 = scanner.nextInt();

        try {
            int result = number / number1;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("除零异常了");
        }
        System.out.println("后续代码");

    }
}
