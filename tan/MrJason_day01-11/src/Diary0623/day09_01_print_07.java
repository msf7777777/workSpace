package Diary0623;

import java.util.Scanner;

public class day09_01_print_07 {
	public static void print(int msf,String zjm){
		for(int x = 1;x <= msf;x++){
			for(int y =1;y <= x;y++){
				System.out.print(zjm);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����ϣ���Ƕ����У���");
		int a = s.nextInt();
		System.out.println("����ϣ����ʲô�����㣿��");
		String b = s.next();
		print(a,b);
	}
}