package Diary0620;

import java.util.Scanner;

public class day07_09_LianXi_05_ZuoYe_HunJia_ChongZuo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��߶��٣���CM��");
		int high = s.nextInt();
		System.out.println("�����٣���RMB��");
		long money = s.nextLong();
		System.out.println("˧�𣿣�true or false��");
		boolean handsome = s.nextBoolean();
		if(high >= 180 && money >= 10000000 && handsome){
			System.out.println("��Ҫ�޸�����");
		}else if(high <= 180 && money <= 10000000 && !handsome){
			System.out.println("����");
		}else{
			System.out.println("�ްɣ����ϲ��㣬��������");
		}
		System.out.println("�󼪴���������Լ�");
		
		
		
		
		s.close();
	}
}
