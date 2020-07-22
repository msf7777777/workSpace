package cn.itcast.code.function;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        System.out.println(getSum() + 10);
    }

    public static int getSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个");
        int a = sc.nextInt();
        System.out.println("请输入第二个");
        int b = sc.nextInt();
        return a + b;
    }
}
