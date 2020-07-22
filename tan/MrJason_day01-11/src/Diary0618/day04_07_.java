package Diary0618;

public class day04_07_ {
	public static void main(String[] args) {
		//错误编译 int 中国 = 10；
		//int 中国 = 10；
		
		int a = 10;
		final int A = 15;
		final int B = 12;
		
		a = B;//12
		
		final int C = B + a;//24
		
		a = 5;
		final int D = C + B + a;//41=24+12+5
		System.out.println(D);//【41】
		
		int e = 8;
		//编译错误 int e = 9;
		int E = 9;
		//java大小写敏感，严格区分大小写
		
		//编译错误 int class = 20；
		int Class = 20;
		int a_class = 20;
		
		//错误编译 int true = 2;
		//特殊值包含：true,false,null
		
		
		
		
	}
}
