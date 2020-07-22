package cn.itcast.task;

import java.util.Scanner;

/*
7.已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。
  完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
  如果不存在请输入-1
 */
public class task07_teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 28, 28, 37, 46, 50};
        System.out.println("输入索引");
        int number = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
