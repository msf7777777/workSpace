package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_01 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println(arr1 == arr2);//false
		
		//比较数组中没一个元素的值s
		System.out.println(Arrays.equals(arr1,arr2));//true(需要导入“import java.util.Arrays;”)
		
	}
}
