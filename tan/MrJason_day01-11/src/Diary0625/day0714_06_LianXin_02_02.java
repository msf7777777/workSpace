package Diary0625;

import java.util.Arrays;

public class day0714_06_LianXin_02_02 {
	public static void main(String[] args) {
		int[] arr = {555,67,985,211,886,666};
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr);
		for (int j = 0; j < arr1.length; j++) {
			if(arr[arr.length - 1] == arr1[j]) {
				System.out.println(arr[arr.length - 1]);
				System.out.println(j);
			}
		}
	}
}
