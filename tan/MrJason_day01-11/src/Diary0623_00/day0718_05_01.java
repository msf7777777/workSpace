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
		
		System.out.println("�� ����_���ε��� ��");
		int A = s.nextInt();
		
		System.out.println("�� ����_���ε��� ��");
		int B = s.nextInt();
		
		System.out.println("�� ����_���ε������ ��");
		String C = s.next();
		
		msf(A,B,C);
		
		s.close();
	}
}
