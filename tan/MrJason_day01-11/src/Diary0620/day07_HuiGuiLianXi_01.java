package Diary0620;

import java.util.Scanner;

public class day07_HuiGuiLianXi_01 {
	public static void main(String[] args) {
		System.out.println("��ã������ǰ���");
		System.out.println("�����뿪ʼ��д���ɫ��С˵��");
		System.out.println("����д�������ݣ����ǽ����Զ�����");
		
		Scanner s = new Scanner(System.in);
		System.out.println("������_���У�����");
		int a = s.nextInt();
		System.out.println("������_���У�����");
		int b = s.nextInt();
		System.out.println("������_���У�����");
		int c = s.nextInt();
		System.out.println("��ã������ǡ�18��ա�ɫ����վ");
		System.out.println("���ǵ���վ����  " + a + "��" + b + "��" + c + "��  ������");
		for(int x = 1;x <= a;x++){//�趨���ǵĻ�ɫС˵�ж��� ��
			for(int y = 1;y <= b;y++){//�趨���ǵĻ�ɫС˵�ж��� ��
				for(int z = 1;z <= c;z++){//�趨���ǵĻ�ɫС˵�ж��� ��
					System.out.println("��" + x + "��  " + "��" + y + "��  " + "��" + z + "��");
				}
			}
		}
		
		
		
		
		
		
		
		s.close();
	}
}
