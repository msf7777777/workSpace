package Diary0625;

public class day0714_02_ShuJvLeiXing {
	public static void main(String[] args) {
		int a = 9;
		int b = a;//将a的值拷贝给b
		a = 3;
		System.out.println(b);
		
		int[] arr1 = {100,200,300};
		int[] arr2 = arr1;//arr1和arr2引用同一个数组
		arr1[0] = 101;
		System.out.println(arr2[0]);
	}
}
