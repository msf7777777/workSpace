package cn.itcast.task;

import java.util.Scanner;

/*
1. 请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
        四舍五入之后的结果是一个int整数类型并返回。
        最后对方法进行测试。
*/
public class task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数:");
        double number = sc.nextDouble();
        int result = (int)rounding(number);
        if(result >= 0){
            System.out.println(result);
        }else{
            System.out.println("输入错误!");
        }
    }

    public static double rounding(double number) {
        int result;
        if(number >= 0){
            if(number * 10 % 10 >= 5){
                result = (int)(number + 1);
            }else{
                result = (int)(number);
            }
        }else{
            result = -1;
        }
        return result;
    }
}
