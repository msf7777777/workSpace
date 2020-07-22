package Diary0623;

//import Diary0622.day09_01_print_FuBen;

public class day09_01_print_03 {
	public static void print() {
		for(int x = 1;x <= 4;x++){
			for(int y = 1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	}
	public static void printX(int num) {
		for(int x = 1;x <= num;x++){
			for(int y = 1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	}
	public static void main(String[] args) {
		print();
	}
}
