package cn.itcast;

import java.util.Scanner;

/*
请输入小明左手中的纸牌：
10
请输入小明右手中的纸牌：
8

互换前小明手中的纸牌：
左手中的纸牌：10
右手中的纸牌：8

互换后小明手中的纸牌：
左手中的纸牌：8
右手中的纸牌：10
*/
public class Tast01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入左手的牌");
        int left = sc.nextInt();
        System.out.println("请录入右手的牌");
        int right = sc.nextInt();
        //将left和right的值进行交换
        //借助第三个容器
        int temp = left;//将 left的东西放到 temp里面
        left = right;//将 right的东西放到 left里面
        right = temp;//将 temp的东西放到 right里面
        System.out.println(left);
        System.out.println(right);
    }
}
