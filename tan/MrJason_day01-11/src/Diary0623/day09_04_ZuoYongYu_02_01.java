package Diary0623;

public class day09_04_ZuoYongYu_02_01 {
	//声明了类变量，是全局变量，只要能访问到它，都可以直接使用它
	//可以在本类的所有方法中使用
	//也可以在其他类的方法中使用，前提是这个类变量使用了public修饰符
	//如果使用private修饰符，只能在本类中访问
	public static int count = 7777777;
	private static int fuck = 4444;
	
	public static void f1(){
		int n = 2;
		if(n >= 2){
			//a是在if块中申明的，它的作用域是从申明的地方开始，一直到块结束
			int a = 5;
			System.out.println(a);
		}
		System.out.println(n);
		System.out.println(count);
		System.out.println(fuck);
	}
	public static void f2(){
//		System.out.println(n);//编译错误，“n”是在f1方法中申明的
//		System.out.println(a);//编译错误，一样访问不到
		System.out.println(count);
		System.out.println(fuck);
	}
	//参数n在f3放噶被调用时创建，f3方法执行完毕后销毁
	//参数n的作用域是整个方法体
	public static void f3(){
		System.out.println(count);
		System.out.println(fuck);
				
	}
	public static void main(String[] args) {
		System.out.println(count);
		System.out.println(fuck);
	}
}
