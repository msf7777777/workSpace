package cn.itcast.test21;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个月份:");
        int yue = scanner.nextInt();
        if(yue == 1 || yue == 2 || yue == 3){
            System.out.println("第一季度");
        }else if(yue == 4 || yue == 5 || yue == 6){
            System.out.println("第二季度");
        }else if(yue == 7 || yue == 8 || yue == 9){
            System.out.println("第三季度");
        }else if(yue == 10 || yue == 11 || yue == 12){
            System.out.println("第四季度");
        }else{
            System.out.println("输入月份不合法!");
        }
    }
}
