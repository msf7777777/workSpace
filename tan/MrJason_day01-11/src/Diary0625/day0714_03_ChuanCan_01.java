package Diary0625;

public class day0714_03_ChuanCan_01 {
	public static void f(int n) {
		n = 9;
	}
	public static void main(String[] args) {
		//传参和赋值是一样的
		int a = 10;
		f(a);//拷贝实际参数a的值到形式参数n
		System.out.println(a);//10
		System.out.println("**********【1】**********");
		
		int n = 12;
		f(n);//拷贝实际参数n的值到形式参数n
		System.out.println(n);//10，这里的n和f中的n不是一个变量
		System.out.println("**********【2】**********");
		
	}
}
