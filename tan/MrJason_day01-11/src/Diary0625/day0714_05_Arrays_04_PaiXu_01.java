package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_04_PaiXu_01 {
	public static void main(String[] args) {
		int[] arr = {20,4,16,80};
		//将数组中的数从小到大排序
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}