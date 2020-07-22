package cn.itcast.code.function_practise;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();
        print(number);
    }

    public static void print(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0){
                System.out.print(i + "\t");
                count++;
                if(count % 3 == 0){
                    System.out.println();
                }
            }
        }
    }
}
