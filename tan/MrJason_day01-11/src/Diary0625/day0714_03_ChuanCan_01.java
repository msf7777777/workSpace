package Diary0625;

public class day0714_03_ChuanCan_01 {
	public static void f(int n) {
		n = 9;
	}
	public static void main(String[] args) {
		//���κ͸�ֵ��һ����
		int a = 10;
		f(a);//����ʵ�ʲ���a��ֵ����ʽ����n
		System.out.println(a);//10
		System.out.println("**********��1��**********");
		
		int n = 12;
		f(n);//����ʵ�ʲ���n��ֵ����ʽ����n
		System.out.println(n);//10�������n��f�е�n����һ������
		System.out.println("**********��2��**********");
		
	}
}
