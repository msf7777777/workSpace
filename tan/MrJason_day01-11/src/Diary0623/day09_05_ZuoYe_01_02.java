package Diary0623;

import java.util.Scanner;

public class day09_05_ZuoYe_01_02 {
	public static void f1(int x,int y,String str){
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���뼸��_ ��");
		int a = s.nextInt();
		System.out.println("�� ���뼸��_ ��");
		int b = s.nextInt();
		System.out.println("�� �������_ ��");
		String c = s.next();
		f1(a,b,c);
		s.close();
	}
}
