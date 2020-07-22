package cn.itcast.task;

import java.util.Scanner;

/*
5. 在编程竞赛中, 有6个评委为参赛的选手打分, 分数在0~100之间.
   假设小明参加比赛后, 评委对其进行打分,
   求小明的平均分是多少, 并将结果打印到控制台上.

   打印格式:
		请录入第一个评委的分数:
		90
		请录入第二个评委的分数:
		100
		...  //这里要接收6个教练的评分.

		选手的最终得分情况为: 去掉最高分**, 去掉最低分**, 求出平均分为: **
 */
public class task05 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int score;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩：");
            score = sc.nextInt();
            arr[i] = score;
        }
        //定义一个数接收最大值
        int max = arr[0];
        //定义一个数接收最小值
        int min = arr[0];
        System.out.println(max);
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        //定义一个数接收分数总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //定义一个数接收平均数
        int average = (sum - max - min) / 4;
        System.out.println(average);
    }
}
