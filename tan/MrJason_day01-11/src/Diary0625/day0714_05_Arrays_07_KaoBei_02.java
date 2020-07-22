package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_07_KaoBei_02 {
	public static void main(String[] args) {
		int[] arr = {20,4,16,80};
//		拷贝arr某个元素之前的所有元素到arr1
//		创建一个新的数组，将原数组中的元素一次复制到新的数组
//		复制的是元素，不是数组地址！！！
		int[] arr1 = Arrays.copyOf(arr, 6);
		System.out.println(Arrays.toString(arr1));//【[20, 4, 16, 80, 0, 0]】
		System.out.println(arr);//【[I@15db9742】
		System.out.println(arr1);//【[I@6d06d69c】
		System.out.println("**********【1】**********");
		
		arr1 = arr;
		System.out.println(arr1);//【[I@15db9742】
		System.out.println(Arrays.toString(arr1));//【[20, 4, 16, 80]】
		System.out.println("**********【2】**********");
		
		int[] arr2 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr2));//【[20, 4, 16]】
		System.out.println("**********【3】**********");
		
	}
}