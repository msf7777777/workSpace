package cn.itcast;

import java.util.Scanner;

public class Tast02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三位数");
        int number = scanner.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        if (ge * ge * ge + shi * shi * shi + bai * bai * bai == number) {
            System.out.println(number + "是水仙花数");
        } else {
            System.out.println(number + "不是水仙花数");
        }
    }
}
