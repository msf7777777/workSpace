package Diary0623;

import java.util.Scanner;

public class day09_05_ZuoYe_02_02 {
	public static int s(int x,int y){
		int s = x * y;
		return s;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("№ 输入矩形的_长 №");
		int a = s.nextInt();
		System.out.println("№ 输入矩形的_宽 №");
		int b = s.nextInt();
		s.close();
		int msf = s(a,b);
		System.out.println("№ 所求矩形面积为 №");
		System.out.println(msf);
	}
}
