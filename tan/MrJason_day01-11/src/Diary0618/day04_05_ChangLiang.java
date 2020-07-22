package Diary0618;

public class day04_05_ChangLiang {
	public static void main(String[] args) {
		//申明一个常量a
		final int a;
		a = 5;
		final double b = 2.5;
		System.out.println(a + b);//【7.5】
		
		final double c = a + b;
		System.out.println(c);//【7.5】
		
		double d = 8.5;
		System.out.println(d / 8.5);//【1.0】
		
		int e = 3;
		double f = 5.01;
		
		System.out.println(a + e);//【8】
		System.out.println(a + f);//【10.01】
		System.out.println(f + f);//【10.02】
		System.out.println(f * 3);//【15.03】
		
		e = 4;//原先e = 3
		System.out.println(a + e);//【9】
		
		final int MSF = 7777777;//常量名一般使用大写，用于和变量区分
		System.out.println(MSF);//【7777777】
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
