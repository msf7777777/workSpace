package Diary0623;

import java.util.Scanner;

public class day09_05_ZuoYe_02_01 {
	public static void f1(int x,int y,int z) {
		x = 1;
		y = 1;
		z = x * y;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("№ 输入矩形的_长 №");
		int a = s.nextInt();
		System.out.println("№ 输入矩形的_宽 №");
		int b = s.nextInt();
		s.close();
		int c = a * b;
		f1(a,b,c);
		System.out.println(c);
	}
}
