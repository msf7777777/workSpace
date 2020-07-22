package cn.itcast.code.function;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字");
        int number = sc.nextInt();
        System.out.println("再输入一个数字");
        int number2 = sc.nextInt();
        getMax(number, number2);
    }

    public static void getMax(int a, int b) {
        int result = a > b ? a : b;
        System.out.println("最大数字是: " + result);
    }
}
