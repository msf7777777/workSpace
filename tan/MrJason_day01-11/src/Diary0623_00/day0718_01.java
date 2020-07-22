package Diary0623_00;

public class day0718_01 {
	public static void print() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		day0718_01.print();
		System.out.println("----------¡¾1¡¿----------");
		day0718_02.msf();
		System.out.println("----------¡¾2¡¿----------");
		day0718_02.zjm();
		print();
		System.out.println("----------¡¾4¡¿----------");
	}
}
