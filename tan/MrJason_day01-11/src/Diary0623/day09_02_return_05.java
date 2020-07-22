package Diary0623;

public class day09_02_return_05 {
	public static void main(String[] args) {
		//方法调用结束后，返回值将会占据方法调用的位置
		System.out.println(f());
		System.out.println(g());
		f4(0);
	}
	//方法调用结束后，返回值将会占据方法调用的位置，就是“a”会占据“f()”的位置
	public static int f(){//方法调用结束后，返回值将会占据方法调用的位置
		return 'a';//方法调用结束后，返回值将会占据方法调用的位置
	}
	public static int g(){
		//错误编译，需要像下面这样强制转换
//		return 10L;
		//强制转换有可能会破坏数据（如果数据容量不够）
		return (int) 10L;
	}
	public static long h(){
		//int可以自动转换为long，所以返回没有问题
		return 1;
	}
	//void方法也可以使用return
	public static void f4(int num){
		if(num <=0){
			System.out.println("非法数据");
			//“return;”表示终止方法执行
			return;
		}
		for(int i = 1;i <= num;i++){
			for(int j = 1;j <= i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	//return后面不能跟其他语句
	public static int k(){
		return 1;
//		System.out.println("");//错误编译return后面不能跟其他语句
	}
}
