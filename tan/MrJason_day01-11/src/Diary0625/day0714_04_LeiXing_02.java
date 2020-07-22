package Diary0625;

public class day0714_04_LeiXing_02 {
	public static void main(String[] args) {
		//基本类型相等比较
		int a = 10;
		int b = 10;
		System.out.println(a == b);//true，比较的是值
		
		//引用类型的相等比较
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,1};
		//变量arr1和arr2存放的是不同数组的地址
		System.out.println(arr1 == arr2);//false
		System.out.println(arr1 .equals(arr2));//false
		System.out.println(arr1[0] == arr2[0]);//true
		System.out.println(arr1[0] == arr2[3]);//true
		System.out.println(arr2[0] == arr2[3]);//true
		System.out.println("**********【1】**********");
		int[] arr3 = arr1;
		System.out.println(arr1 == arr3);//true
	}
}
