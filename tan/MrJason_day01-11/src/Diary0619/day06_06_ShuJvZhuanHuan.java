package Diary0619;

public class day06_06_ShuJvZhuanHuan {
	public static void main(String[] args) {
		long number1 = 1689;
//		int number2 = number1;// 错误编译 long不能随意转换int
		int number2 = (int)number1;//()括号强制转换long为int
		System.out.println(number2);//【1689】
		
		long number3 = 2147483648L;
		int number4 = (int)number3;
		System.out.println(number4);//【-2147483648】数据丢失
		
		long a = 2147483648L;
		int b = (int)a;
		System.out.println(b);//【-2147483648】
		
		b = 2147483647;
		System.out.println(b);//【2147483647】
		
//		int x = 88.99;// 编译错误
		int x = (int)88.99;
		System.out.println(x);//【88】去除小数点之后的，并非四舍五入
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
