package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_02 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println(arr1 == arr2);//false
		System.out.println(Arrays.equals(arr1, arr2));//true
	}
}
