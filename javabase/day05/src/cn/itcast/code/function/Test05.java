package cn.itcast.code.function;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字");
        int number = sc.nextInt();
        isEvenNumber(number);
    }

    public static void isEvenNumber(int number) {
        if(number % 2 ==0){
            System.out.println(number + " 是偶数");
        }else{
            System.out.println(number + " 是奇数");
        }
    }
}
