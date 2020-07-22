package cn.itcast.task;

import java.util.Scanner;

/*
7.已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。
  完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
  如果不存在请输入-1
 */
public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("输入索引");
        int i = sc.nextInt();
        if(i <= 4 && i >= 0){
            System.out.println(arr[i]);
        }else{
            System.out.println("-1");
        }
    }
}
