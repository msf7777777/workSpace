package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_05_ChaZhao {
	public static void main(String[] args) {
		int[] arr = {20,4,16,80};
		//����Ԫ�ء�4�����±�
		System.out.println(Arrays.binarySearch(arr, 4));//��1��
		//����Ԫ�ء�80�����±�
		System.out.println(Arrays.binarySearch(arr, 80));//��3��
	}
}
