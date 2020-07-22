package Diary0625;

public class day0714_03_ChuanCan_02_01 {
	public static void f(int[] n) {
		//将n引用的数组的第一个元素赋值为9
		n[0] = 9;
	}
	public static void main(String[] args) {
		//传参和赋值是一样的
		int [] a = {100,200,300};
		f(a);//拷贝实际参数a的值（数组的地址）到形式参数n，现在a和n引用同一个数组
		//取a引用的数组的第一个元素
		System.out.println(a[0]);//9
		System.out.println(a[1]);//200
		System.out.println(a[2]);//300
	}
}
