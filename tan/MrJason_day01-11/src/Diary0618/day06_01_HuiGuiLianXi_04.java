package Diary0618;

import java.util.Scanner;

public class day06_01_HuiGuiLianXi_04 {
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("����ã����ѣ��������԰������ٳա�");
		System.out.println("��ʥ���ڵ��ˣ�ף��ʥ���ڿ��֣�����");
		System.out.println("|������һ��ʥ������Ϊ�����͸����|");
		System.out.println("|�����㻹�����Լ�����������ӡ�|");
		System.out.println("��������˵����ϣ����ʥ���������ӡ�");
		System.out.println("************************");
		System.out.println(" ");
		System.out.println("************************");
		
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���10�㣬��ϣ�����Ƕ��ٲ㣿 ��");
		System.out.println("************************");
		int a = s.nextInt();
		s.close();
		//����ͼ�ı���
		int kg = a - 1;//����ͼ��һ�пո����
		for(int x = 1;x <= a;x++){//����ͼ������
			//����ͼÿ��֮ǰ�Ŀո�
			for(int y = 1;y <= kg;y++){//����ͼÿ��֮ǰ�Ŀո�
				System.out.print(" ");
			}
			//����ͼÿ�еġ�*���ĸ���
			for(int z = 1;z <= a - kg  ;z++){//����ͼÿ�еġ�*���ĸ���
				System.out.print("*");
				System.out.print(" ");//ÿ������*��֮�䶼����һ���ո�
			}
			System.out.println("������Ŀո���ô�������");
			System.out.println("");
			kg--;
		}
		
		//����ͼ�ı���
		for(int m = 1;m <= a - 2;m++){//����ͼ������
			//����ͼÿ��֮ǰ�Ŀո�
			for(int n = 1;n <= a - 2;n++){//����ͼÿ��֮ǰ�Ŀո�
				System.out.print(" ");
			}
			System.out.print("*" + " " + "*");
			System.out.println("������û�пո�");
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
	}
}
