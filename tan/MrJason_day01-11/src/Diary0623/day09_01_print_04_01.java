package Diary0623;

import java.util.Scanner;

public class day09_01_print_04_01 {
	//int num是形式参数，调用此方法时必须传递一个int数值
	
	public static void printMaShaoFei(int num) {
		for(int x = 1;x <= num;x++){
			for(int y = 1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	}
	public static void main(String[] args) {
		//7是实际参数
		//调用printMaShaoFei时，7将被拷贝给形式参数num
		printMaShaoFei(7);
		System.out.println("上面是7行");
		//10是实际参数
		//调用printMaShaoFei时，7将被拷贝给形式参数num
		printMaShaoFei(10);
		System.out.println("上面是10行");
		
		//n是实际参数
		//调用printMaShaoFei时，n将被拷贝给形式参数num
		int n = 5;
		printMaShaoFei(n);
		
		//m是实际参数
		//调用printMaShaoFei时，m将被拷贝给形式参数num
		Scanner s = new Scanner(System.in);
		System.out.println("〓这次你又想打印几行？〓");
		int m = s.nextInt();//此处可以“final int m = s.nextInt();”
		if(m <= 5 && m > 0){
			printMaShaoFei(m);
			System.out.println("上面是" + m + "行");
		}else{
			System.out.println("滚！");
		}
		s.close();
		
	}
	
}