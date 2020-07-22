package cn.itcast.task.task01_05;

import java.util.Scanner;

/*
题目七
	键盘录入一行数字字符串, 每个数字之间,用","隔开, 请求出这些数字的平均值
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一行数字字符串:");
        String number = scanner.next();
        String[] arr = {number};
        System.out.println(arr);
        for (int i = 0; i < arr[0].length(); i++) {
            if(arr[0].charAt(i) >= '0' && arr[0].charAt(i) <= '9' && i < arr[0].length() - 1){
                System.out.print(arr[0].charAt(i) + ",");
            }else{
                System.out.println(arr[0].charAt(i));
            }
        }
        int sum = Integer.parseInt(arr[0]);
        int result = 0;
        for (int i = 0; i < arr[0].length(); i++) {
            result = sum / (int)(1 * Math.pow(10, i)) % 10 + result;
        }
        result = result / arr[0].length();
        System.out.println(result);
    }
}
