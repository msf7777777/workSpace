package Diary0625;

public class day0714_03_ChuanCan_02_04_01 {
	public static void f(int[] n) {
		
		n[1] = 9;
	}
	public static void main(String[] args) {//���κ͸�ֵ��һ����
		int [] a = {100,200,300};
		f(a);
		System.out.println(a[1]);//9
		
		int[] b;
		b = new int [9];
		f(b);
		System.out.println(b[1]);//9
	}
}
