package cn.itcast.task;

import java.util.Scanner;

/*
7.	我们知道数学中有九九乘法表。
    请定义一个方法，方法的功能是打印nn乘法表。
    在主方法中键盘录入取值范围为[1-9]的变量n，
    测试方法。执行效果如下：
		请输入一个1-9之间的整数：
		4
		乘法表：
		1×1=1
		1×2=2	2×2=4
		1×3=3	2×3=6	3×3=9
		1×4=4	2×4=8	3×4=12	4×4=16

*/
public class task07_teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要的[nn乘法表]的 n 是多少?:");
        int n = sc.nextInt();
        printTable(n);
    }

    public static void printTable(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
