package Diary0618;

public class day04_04_ShengDanShu {
	public static void main(String[] args) {
		//叶子层
		final int level = 10;
		//根层
		final int rootLevel = 2;
		int spaceNum = level - 1;
		
		//画叶子
		// 为什么从1开始   不管了就是任性
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
		
		//画根
		for (int i = 1; i <= rootLevel; i++) {
			for (int g = 1; g < level; g++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
}

