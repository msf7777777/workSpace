package Diary0618;

public class day06_01_HuiGuiLianXi_02 {
	public static void main(String[] args) {
		final int Ҷ�Ӳ� = 10;
		final int ���� = 2;
		int kg = 9;//kg == 9 �ǳ�ʼ�ո����
		//Ҷ�Ӳ����
		for(int x = 1;x <= 10;x++){
			for(int z = 1;z <= kg;z++){//�˴���дҶ��ǰ�м����ո�
				System.out.print(" ");
			}
			kg--;
			for(int m = 1;m <= 2 * x - 1;m++){//�˴���д�м�ƬҶ��
				System.out.print("*");
			}
			System.out.println();
		}
		//�������
		for(int y = 1;y <= 2;y++){
			for(int n = 1;n < 10;n++){//�˴���д��ǰ�м����ո�
				System.out.print(" ");
			}
			System.out.print("*\n");//�˴���д�м�����
		}
	}
}
