package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_05_ChaZhao {
	public static void main(String[] args) {
		int[] arr = {20,4,16,80};
		//查找元素“4”的下标
		System.out.println(Arrays.binarySearch(arr, 4));//【1】
		//查找元素“80”的下标
		System.out.println(Arrays.binarySearch(arr, 80));//【3】
	}
}
