package Diary0623;

import java.util.Scanner;

public class day09_02_return_03 {
	public static int z(int x,int y) {
		int z = 0;
		for (int i = x; i <= y; i++) {
			z = z + i;
		}
		return z;
	}
	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("�����!�ҿ��԰������������������֮��ĺ͡�");
		System.out.println("******************************");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("******************************");
		System.out.println("��������뿪ʼ��μ��㣬�������� ��fuck����");
		System.out.println("******************************");
		System.out.println();
		String qq = s.next();
		
		String xxx = "fuck";
		boolean f = xxx .equals(qq);
		if(f){
			System.out.println("******************************");
			System.out.println("�� Yeah,baby!Fuck U Too,Bitch ��");
			System.out.println("******************************");
			System.out.println();
			System.out.println("******************************");
			System.out.println("����������������  Fuck U ����������������");
			System.out.println("���������������� ��д_��a������������������");
			System.out.println("������������������   ��  �� ������������������");
			System.out.println("******************************");
			int a = s.nextInt();
			
			System.out.println("******************************");
			System.out.println("����������������  Fuck U ����������������");
			System.out.println("���������������� ��д_��b������������������");
			System.out.println("������������������   ��  �� ������������������");
			System.out.println("******************************");
			int b = s.nextInt();
			
			int msf = z(a,b);
			System.out.println("����������������  Winner!����������������");
			System.out.println("��                                                                      ��");
			System.out.println("             " + msf);
			System.out.println("��                                                                      ��");
			System.out.println("����������������  Winner!����������������");
			
		}else{
			System.out.println("����������������    Loser ����������������");
			System.out.println("��                                                                      ��");
			System.out.println("             " + "WTF?");
			System.out.println("��                                                                      ��");
			System.out.println("����������������    Loser ����������������");
		}
		s.close();
	}
}
