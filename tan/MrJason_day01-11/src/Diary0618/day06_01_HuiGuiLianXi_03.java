package Diary0618;

public class day06_01_HuiGuiLianXi_03 {
	public static void main(String[] args) {
		final int Ҷ�Ӳ� = 10;
		final int ���� = 2;
		int kg = 0;//kg == 9 �ǳ�ʼ�ո����
		
		//�������
		for(int y = 1;y <= 2;y++){
			for(int n = 1;n < 10;n++){//�˴���д��ǰ�м����ո�
				System.out.print(" ");
			}
			System.out.print("*\n");//�˴���д�м�����
		}
		
		//Ҷ�Ӳ����
		for(int x = 1;x <= 10;x++){
			for(int z = 1;z <= kg;z++){//�˴���дҶ��ǰ�м����ո�
				System.out.print(" ");
			}
			kg++;
			for(int m = 1;m <= 21 - x * 2;m++){//�˴���д�м�ƬҶ��
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
