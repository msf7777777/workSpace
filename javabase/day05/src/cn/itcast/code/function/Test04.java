package cn.itcast.code.function;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入a的值");
        int aNum = sc.nextInt();
        System.out.println("输入b的值");
        int bNum = sc.nextInt();
        getSun(aNum,bNum);
    }

    public static void getSun(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}