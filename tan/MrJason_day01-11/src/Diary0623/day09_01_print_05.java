package Diary0623;

import java.util.Scanner;

public class day09_01_print_05 {
	public static void printMsf(final int msf) {
		for(int x = 1;x <= msf;x++){
			for(int y = 1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public static void printM() {
		for(int x = 1;x <= 5;x++){
			for(int y = 1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public static void printN(int x,int y) {
		int z = x + y;
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ٷɣ�����������ӡ���У���");
		final int zjm = s.nextInt();
		if(zjm <= 7 && zjm >= 1){
			printMsf(zjm);
		}else{
			System.out.println("����");
		}
		
		printM();
		System.out.println("*********************");
		
		System.out.println("��fuck_��������1��");
		int a = s.nextInt();
		System.out.println("��fuck_��������2��");
		int b = s.nextInt();
		System.out.println("������������Ҫ�ġ�printN���Ľ����");
		printN(a,b);
		
		
		
		s.close();
	}
}
