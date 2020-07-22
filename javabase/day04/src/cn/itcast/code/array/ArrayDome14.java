package cn.itcast.code.array;

import java.util.Scanner;

/*
1. 在编程竞赛中, 有6个评委为参赛的选手打分, 分数在0~100之间[
2. 选手的最后得分为: 去掉(一个最高分 + 去掉一个) , 然后和4取余即可
 */
public class ArrayDome14 {
    public static void main(String[] args) {
        //1.创建长度为6的数组来装没一个评委的分数
        int[] arr = new int[6];
        //2.键盘接受6个人的分数,存到数组中
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分");
            int score = scanner.nextInt();
            arr[i] = score;
        }
        //数组中已经存了6个分数
        //1.求数组中的最大值和最小值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if(number >= max){
                max = number;
            }
            if(number <= min){
                min = number;
            }
            sum += number;
        }
        int avg = (sum - max - min) / 3;
        System.out.println(avg);
    }
}
