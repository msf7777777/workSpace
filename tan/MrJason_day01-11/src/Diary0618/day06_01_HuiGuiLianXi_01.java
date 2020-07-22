package Diary0618;

public class day06_01_HuiGuiLianXi_01 {
	public static void main(String[] args) {
		//叶子层
		final int y = 10;// y 是叶子层
		//根层
		final int g = 2;// g 是根层
		//第几层
		int i;// i 是第几层
		//空格数
		int k;//空格数
		//叶子
		int z;//叶子
		//空格
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
