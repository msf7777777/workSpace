package Diary0625;

public class day0714_01_ShuZu_07 {
	public static void main(String[] args) {
		int[] arr = {100,200,300,400,500};
		//ʹ��forѭ�����������е�����Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("**********��1��**********");
		
		//ʹ��foreach����������
		//ÿ��ִ�е���ʱ����arr�ж�Ӧ��Ԫ��ȡ������ֵ��i
		//i����ǰԪ�أ���Ϊ��ִ�е���ʱ�����
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("**********��2��**********");
		
		String[] arr1 = {"a","b","c"};
		//String��Ԫ�ص�����
		for(String str : arr1){
			System.out.println(str);
		}
		System.out.println("**********��3��**********");
		
		//��ǿ��forѭ�������޸�Ԫ�ص�ֵ
		for (int i : arr) {
			i = 1;
		}
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("**********��4��**********");
	}
}
