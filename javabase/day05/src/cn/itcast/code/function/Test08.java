package cn.itcast.code.function;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        boolean flag = isEvenNumber();
        if(flag == true){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }

    public static boolean isEvenNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个int类型的值");
        int number = sc.nextInt();
        return number % 2 == 0;
    }
}
