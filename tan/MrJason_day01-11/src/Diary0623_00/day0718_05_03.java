package Diary0623_00;

import java.util.Scanner;

public class day0718_05_03 {
	public static int msf(int x,int y,int z) {
		return x > y ? (x > z ? x : z) : (y > z ? y : z);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� ����_x��ֵ ��");
		int X = s.nextInt();
		
		System.out.println("�� ����_y ��");
		int Y = s.nextInt();
		
		System.out.println("�� ����_z ��");
		int Z = s.nextInt();
		
		msf(X,Y,Z);	
		
		System.out.println("�𰸽��������ֵ��");
		
		System.out.println(msf(X,Y,Z) + "�����" + msf(X,Y,Z));
		
		s.close();
	}
}
