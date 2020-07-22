package Diary0622;

public class day09_01_print_FuBen {
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
		day09_01_print_FuBen.print();
		System.out.println();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		for(int x = 1;x <= 2;x++){
			day09_01_print_FuBen.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	