package Diary0623;

public class day09_05_ZuoYe_03_03_02 {
	public static int msf(int a,int b,int c) {
		return a > b ? (a > c ? a : c):(b > c ? b : c);
	}
	public static void main(String[] args) {
		System.out.println(msf(5,21,6));
	}
}
