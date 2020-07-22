package cn.itcast.task;

import java.util.Scanner;

/*
6. 通过键盘录入两个整数n和m。
n代表行数，m代表列数。
定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：
		请输入行数：
		4
		请输入列数：
		5
		@@@@@
		@@@@@
		@@@@@
		@@@@@
*/
public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数:");
        int m = sc.nextInt();
        System.out.println("请输入行数:");
        int n = sc.nextInt();
        System.out.println("请输入想要的图案(一个字符):");
        System.out.println("如果你不输入一个字符,我也没办法");
        System.out.println("java规定scanner只能接受next（）字符串");
        System.out.println("没有接受char的方法,我问过老师");
        String str = sc.next ();
        drawing(m, n, str);
    }

    public static void drawing(int m, int n, String str) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
