package Diary0623;

public class day09_05_ZuoYe_03_02_02 {
	public static int x(int a,int b,int c) {
		int x = a > b ? (a > c ? a : c) : (b > c ? b : c);
		return x;
	}
	public static void main(String[] args) {
		int X = x(6,8,3);
		System.out.println(X);
	}
}
