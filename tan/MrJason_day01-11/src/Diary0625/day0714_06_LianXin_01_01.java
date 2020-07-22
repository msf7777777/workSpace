package Diary0625;

import java.util.Arrays;

public class day0714_06_LianXin_01_01 {
	//【作业】找出数组中元素的最大值【琴痴的答案】
	public static void main(String[] args) {
		int[] arr = {555,67,985,211,886,666};
		Arrays.sort(arr);
		for (int i = (arr.length - 1); i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
