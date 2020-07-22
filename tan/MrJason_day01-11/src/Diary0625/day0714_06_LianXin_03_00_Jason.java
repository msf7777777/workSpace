package Diary0625;

import java.util.Arrays;

public class day0714_06_LianXin_03_00_Jason {
	//【作业】数组反转[12345]---[54321]【Jason】
	public static void reverse(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {555,67,985,211,886,666};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}
