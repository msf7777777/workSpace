package Diary0623;

import java.util.Scanner;

public class day09_01_print_06 {
	public static void printM(boolean n) {//���д��
		if(n){
			System.out.println("����ƥ��");
		}else{
			System.out.println("�������ϵܣ�����������~");
		}	
	}
	public static void mainX(String[] args) {
		System.out.println("��ã�");	
	}
	public static void main(String[] args) {
		System.out.println("�д󵱼�  Come on�������Ҹ�ϱ���ɣ�");
		System.out.println("����ʵ�ش����������");
		Scanner s = new Scanner(System.in);
		System.out.println("����ϣ��������ֵ�Ƕ��٣���0-100����");
		int a = s.nextInt();
		System.out.println("����˵�������ֵ�Ƕ��٣���0-100����");
		int b = s.nextInt();
		boolean n = a >= b;
		if(a >=0 && a <= 100 && b >= 0 && b <= 100){
			printM(n);
		}else{
			System.out.println("�����裡����أ�");
		}
		s.close();
	}
	public static void mainY(String[] args) {
		System.out.println("��ã�");	
	}
}
