package Diary0623_00;

import java.util.Scanner;

public class day0718_04_02 {
	public static int sum(int start,int end){
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,100));
		
		Scanner s = new Scanner(System.in);
		System.out.println("�� ����_Start���� ��");
		int Start = s.nextInt();
		System.out.println("�� ����_End���� ��");
		int End = s.nextInt();
		System.out.println(sum(Start,End));
		s.close();
		
		
	}
}
