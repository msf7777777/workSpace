package Diary0618;

public class day04_04_ShengDanShu {
	public static void main(String[] args) {
		//Ҷ�Ӳ�
		final int level = 10;
		//����
		final int rootLevel = 2;
		int spaceNum = level - 1;
		
		//��Ҷ��
		// Ϊʲô��1��ʼ   �����˾�������
		for (int i = 1; i <= level; i++) {
			for (int g = 1; g <= spaceNum; g++) {
				System.out.print(" ");
			}
			spaceNum--;
			for (int j = 1; j <= ((i * 2) -1); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//����
		for (int i = 1; i <= rootLevel; i++) {
			for (int g = 1; g < level; g++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
}

