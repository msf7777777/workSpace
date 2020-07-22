package Diary0623;

public class day09_01_print_01 {
	//public指示这个方法是公有的，可以在其他类中调用
	//static指示这个方法是静态的，可以不创建对象通过类名调用
	//void指示这个方法是没有返回值
	//这个是方法申明，方法不必main在方法之前
	//方法的名字是“print”
	//每个方法都提供一个功能
	//这个方法的功能是打印一个5行的直角三角形
	public static void print(){
		for(int x = 1;x <= 7;x++){
			for(int y =1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//调用“day0623_01_print”的print方法
		//当方法被调用时，执行方法中的代码
		//当print方法中的代码块执行结束后，才会继续执行main方法中后续的代码
		//由于print方法和main方法在同一个类中，因此可以忽略掉类名直接调用
		//print();
		
		print();
		System.out.println("〓〓〓〓〓〓〓〓〓第一个〓〓〓〓〓〓〓〓〓");
		day09_01_print_01.print();
		System.out.println("〓〓〓〓〓〓〓〓〓第二个〓〓〓〓〓〓〓〓〓");
		day09_01_print_01.print();
		System.out.println("〓〓〓〓〓〓〓〓〓第三个〓〓〓〓〓〓〓〓〓");
		for(int x = 1;x <= 3;x++){
			day09_01_print_01.print();
		}	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	