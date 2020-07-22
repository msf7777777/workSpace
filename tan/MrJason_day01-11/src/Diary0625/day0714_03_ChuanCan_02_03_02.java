package Diary0625;

public class day0714_03_ChuanCan_02_03_02 {
	public static void f(int[] n) {
		//将n引用的数组的第一个元素赋值为9
		n = new int [10];
		n[1] = 9;
	}
	public static void main(String[] args) {
		//传参和赋值是一样的
		int [] a = {100,200,300};
		System.out.println(a[1]);//200
		f(a);//拷贝实际参数a的值（数组的地址）到形式参数n，现在a和n引用同一个数组
		//取a引用的数组的第一个元素
		System.out.println(a[0]);//100
		System.out.println(a[1]);//9
		System.out.println("**********【1】**********");
		
		int[] b;
//		System.out.println(b);//编译错误，因为b还没有被赋值
		b = new int [9];
		f(b);
		System.out.println(b[1]);//9
		System.out.println("**********【2】**********");
	}
}
