package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_03_TianChong {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("**********��1��**********");
		
		//�������ÿһ��Ԫ�ض���䡰2��
		Arrays.fill(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("**********��2��**********");
	}
}