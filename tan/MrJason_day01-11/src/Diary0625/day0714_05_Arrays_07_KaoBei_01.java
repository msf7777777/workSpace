package Diary0625;

import java.util.Arrays;

public class day0714_05_Arrays_07_KaoBei_01 {
	public static void main(String[] args) {
		int[] arr = {20,4,16,80};
		//����arrĳ��Ԫ��֮ǰ������Ԫ�ص�arr1
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr1));//��[20, 4, 16, 80]��
		System.out.println(arr == arr1);//��false��
		
		//�����±�1���±�2֮���Ԫ�أ�������ͷ����������
		int[] arr2 = Arrays.copyOfRange(arr,1,2);
		System.out.println(Arrays.toString(arr2));//��4��
	}
}