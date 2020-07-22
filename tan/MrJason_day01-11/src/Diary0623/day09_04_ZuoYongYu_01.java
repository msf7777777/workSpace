package Diary0623;

public class day09_04_ZuoYongYu_01 {
	//变量的作用域决定了变量可以在什么地方被访问到。
	//变辆的做同于决定了变量什么时候产生，什么时候销毁
	public static void main(String[] args) {
		//n在方法中申明的，他的作用域是从申明的地方开始，一直到方法结束
		int n = 2;
		if(n >= 2){
			//a是在if块中申明的，它的作用域是从申明的地方开始，一直到块结束
			int a = 5;
			System.out.println(a);
		}
		System.out.println(n);
//		System.out.println(a);//编译错误，“a”已经销毁
		
	}
}
