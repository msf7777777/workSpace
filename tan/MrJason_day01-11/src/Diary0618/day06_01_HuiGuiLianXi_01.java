package Diary0618;

public class day06_01_HuiGuiLianXi_01 {
	public static void main(String[] args) {
		//Ҷ�Ӳ�
		final int y = 10;// y ��Ҷ�Ӳ�
		//����
		final int g = 2;// g �Ǹ���
		//�ڼ���
		int i;// i �ǵڼ���
		//�ո���
		int k;//�ո���
		//Ҷ��
		int z;//Ҷ��
		//�ո�
		int kg = y - 1;
		for(i = 1;i <= y;i++){
			kg--;
			for(k = 0;k <= kg;k++){
				System.out.print(" ");	
			}
			for(z = 1;z <= ((i * 2) - 1);z++){
				System.out.print("*");
			}
			System.out.print("\n");//|| System.out.println("");
		}
		for(i = 1;i <= g;i++){
			for(k = 1;k < 10;k++){
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
}
