package Diary0623_00;

import java.util.Scanner;

public class day0718_05_01 {
	public static void msf(int x,int y,String z) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.print(z);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("№ 输入_矩形的行 №");
		int A = s.nextInt();
		
		System.out.println("№ 输入_矩形的列 №");
		int B = s.nextInt();
		
		System.out.println("№ 输入_矩形的填充物 №");
		String C = s.next();
		
		msf(A,B,C);
		
		s.close();
	}
}
