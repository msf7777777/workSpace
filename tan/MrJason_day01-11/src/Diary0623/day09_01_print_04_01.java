package Diary0623;

import java.util.Scanner;

public class day09_01_print_04_01 {
	//int num����ʽ���������ô˷���ʱ���봫��һ��int��ֵ
	
	public static void printMaShaoFei(int num) {
		for(int x = 1;x <= num;x++){
			for(int y = 1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	}
	public static void main(String[] args) {
		//7��ʵ�ʲ���
		//����printMaShaoFeiʱ��7������������ʽ����num
		printMaShaoFei(7);
		System.out.println("������7��");
		//10��ʵ�ʲ���
		//����printMaShaoFeiʱ��7������������ʽ����num
		printMaShaoFei(10);
		System.out.println("������10��");
		
		//n��ʵ�ʲ���
		//����printMaShaoFeiʱ��n������������ʽ����num
		int n = 5;
		printMaShaoFei(n);
		
		//m��ʵ�ʲ���
		//����printMaShaoFeiʱ��m������������ʽ����num
		Scanner s = new Scanner(System.in);
		System.out.println("������������ӡ���У���");
		int m = s.nextInt();//�˴����ԡ�final int m = s.nextInt();��
		if(m <= 5 && m > 0){
			printMaShaoFei(m);
			System.out.println("������" + m + "��");
		}else{
			System.out.println("����");
		}
		s.close();
		
	}
	
}