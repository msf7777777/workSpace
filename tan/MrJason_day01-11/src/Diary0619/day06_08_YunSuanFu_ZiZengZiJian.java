package Diary0619;

public class day06_08_YunSuanFu_ZiZengZiJian {
	public static void main(String[] args) {
		int x = 3;
		x++;//相当于 x = x + 1	
		System.out.println(x);//【4】
		x--;//相当于x = x - 1
		System.out.println(x);//【3】
		
		int a = 5;
		int b = ++a;
		System.out.println(b);//【6】
		System.out.println(a);//【6】
		//++在前，先参与自身运算，后赋值
		
		int c = 6;
		int d = c++;
		System.out.println(d);//【6】
		System.out.println(c);//【7】
		//++在后，先赋值，后参与自身运算
		
		a = 5;
		b = --a;
		System.out.println(b);//【4】
		System.out.println(a);//【4】
		
		c = 6;
		d = c--;
		System.out.println(d);//【6】
		System.out.println(c);//【5】
		
		
		
		
		
		
		
		
		
		
	}
}
