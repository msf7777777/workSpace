package Diary0625;

public class day0714_03_ChuanCan_02_04_02 {
	public static int f(int[] n) {
		n = new int [10];
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		return n[2];
	}
	public static void main(String[] args) {//传参和赋值是一样的
		int [] a = {100,200,300};
		f(a);
		System.out.println(a[1]);//200
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("**********【1】**********");
		
		int[] b;
		b = new int [9];
		f(b);
		System.out.println(b[1]);//0
		
		int[] c;
		c = new int [10];
		f(c);
		System.out.println(c[1]);//9
		
		System.out.println("**********【2】**********");
		
	}
}
