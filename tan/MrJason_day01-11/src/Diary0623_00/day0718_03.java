package Diary0623_00;

import java.util.Scanner;

public class day0718_03 {
	public static void print(int a,String b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		print(7,"*");
		System.out.println("----------【1】----------");
		
		Scanner s = new Scanner(System.in);
		System.out.println("№ 输入_行 №");
		int A = s.nextInt();
		System.out.println("№ 输入_形状 №");
		String B = s.next();
		print(A,B);
		s.close();
	}
}
