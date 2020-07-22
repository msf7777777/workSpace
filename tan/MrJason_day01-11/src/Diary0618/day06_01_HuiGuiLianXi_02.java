package Diary0618;

public class day06_01_HuiGuiLianXi_02 {
	public static void main(String[] args) {
		final int 叶子层 = 10;
		final int 根层 = 2;
		int kg = 9;//kg == 9 是初始空格次数
		//叶子层编译
		for(int x = 1;x <= 10;x++){
			for(int z = 1;z <= kg;z++){//此处填写叶子前有几个空格
				System.out.print(" ");
			}
			kg--;
			for(int m = 1;m <= 2 * x - 1;m++){//此处填写有几片叶子
				System.out.print("*");
			}
			System.out.println();
		}
		//根层编译
		for(int y = 1;y <= 2;y++){
			for(int n = 1;n < 10;n++){//此处填写根前有几个空格
				System.out.print(" ");
			}
			System.out.print("*\n");//此处填写有几根根
		}
	}
}
