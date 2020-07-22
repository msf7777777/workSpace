package Diary0623;

public class day09_03_ChongZai_01 {
	//一个方法可以和另一个方法有相同的方法名，但必须有不同的方法参数，这种情况叫做方法重载。
	//方法重载的好处，可以为一组方法视同相同的名字，增加可读性
	
	//同一类中，不能有重复的方法签名的。
	
	//以下是一个参数列表为空的方法
	//方法签名，以下方法的方法签名是“f()”
	//方法签名就是方法名字+参数列表
	public static void f(){
		System.out.println("f()");
	}
	//以下是一个参数列表为int的方法
	//方法签名，以下方法的方法签名是“f(int)”
	//方法签名就是方法名字+参数列表
	//变量名不属于参数列表
	public static void f(int number){
		System.out.println("f(int number)");
	}
	public static void f(long number){
		System.out.println("f(long number)");
	}
	//下面参数列表为int
	//编译错误，参数名不属于参数列表，因此方法重复定义
//	public static void f(int n){
//		System.out.println();
//	}
	
	//以下两个方法签名不同，第一个是“f(int,String)”；第二个是“f(String,int)”
	//方法签名 f(int,String)
	public static void f(int number,String str){
		
	}
	//方法签名 f(String,int)
	public static void f(String str,int number){
		
	}
	
//**********************************************//	
	public static void main(String[] args) {
		//调用参数列表为空的参数方法
		f();
		//调用参数列表为int的f方法
		f(1);
		//调用参数列表为long的f方法
		f(2L);
		System.out.println("f()");
		System.out.println("f(1)");
		System.out.println("f(2L)");
	}
}
