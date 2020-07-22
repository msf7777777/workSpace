package Diary0623_00;

//import Diary0623_01.day0718_01;

public class day0718_02 {
	public static void msf() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("7");
			}
			System.out.println();
		}
	}
	
	public static void zjm() {
		System.out.println("这是一个障眼法");
		System.out.println("----------【3】----------");
	}
	
	public static void main(String[] args) {
		day0718_02.msf();
		System.out.println("----------【1】----------");
		day0718_01.print();
		System.out.println("----------【2】----------");
		Diary0623_01.day0718_01.print();
		System.out.println("----------【3】----------");
	}
}
