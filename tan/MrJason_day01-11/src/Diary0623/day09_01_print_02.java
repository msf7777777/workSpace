package Diary0623;
//调用其他包中的类使用“import”来调用
import Diary0622.day09_01_print_FuBen;

public class day09_01_print_02 {
	public static void main(String[] args) {
		//不必导入“day09_01_print”类
		//调用“day09_01_print”的print方法
		day09_01_print_01.print();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		day09_01_print_01.print();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		day09_01_print_FuBen.print();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}
}
