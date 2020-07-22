package cn.itcast.code.practice;

import java.util.Scanner;

public class Test01_ShengDanShu_Me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //叶子层
        System.out.println("请输入你想要叶子层的层数:");
        int levelNum = sc.nextInt();
        final int level = levelNum;
        //根层
        System.out.println("请输入你想要根层的层数:");
        int levelNum2 = sc.nextInt();
        final int leve2 = levelNum2;
        //叶子层空气
        int spaceNum = level - 1;

        //画叶子层
        for (int i = 1; i <= level; i++) {
            for (int j = 1; j <= spaceNum; j++) {
                System.out.print(" ");
            }
            spaceNum--;
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //画跟层
        for (int i = 1; i <= leve2; i++) {
            for (int j = 1; j <= level - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
