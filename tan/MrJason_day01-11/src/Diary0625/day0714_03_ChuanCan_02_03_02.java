package Diary0625;

public class day0714_03_ChuanCan_02_03_02 {
	public static void f(int[] n) {
		//��n���õ�����ĵ�һ��Ԫ�ظ�ֵΪ9
		n = new int [10];
		n[1] = 9;
	}
	public static void main(String[] args) {
		//���κ͸�ֵ��һ����
		int [] a = {100,200,300};
		System.out.println(a[1]);//200
		f(a);//����ʵ�ʲ���a��ֵ������ĵ�ַ������ʽ����n������a��n����ͬһ������
		//ȡa���õ�����ĵ�һ��Ԫ��
		System.out.println(a[0]);//100
		System.out.println(a[1]);//9
		System.out.println("**********��1��**********");
		
		int[] b;
//		System.out.println(b);//���������Ϊb��û�б���ֵ
		b = new int [9];
		f(b);
		System.out.println(b[1]);//9
		System.out.println("**********��2��**********");
	}
}
