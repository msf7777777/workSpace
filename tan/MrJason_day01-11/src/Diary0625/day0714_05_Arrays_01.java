package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_01 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println(arr1 == arr2);//false
		
		//�Ƚ�������ûһ��Ԫ�ص�ֵs
		System.out.println(Arrays.equals(arr1,arr2));//true(��Ҫ���롰import java.util.Arrays;��)
		
	}
}
