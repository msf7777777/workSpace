package Diary0625;

public class day0714_03_ChuanCan_02_01 {
	public static void f(int[] n) {
		//��n���õ�����ĵ�һ��Ԫ�ظ�ֵΪ9
		n[0] = 9;
	}
	public static void main(String[] args) {
		//���κ͸�ֵ��һ����
		int [] a = {100,200,300};
		f(a);//����ʵ�ʲ���a��ֵ������ĵ�ַ������ʽ����n������a��n����ͬһ������
		//ȡa���õ�����ĵ�һ��Ԫ��
		System.out.println(a[0]);//9
		System.out.println(a[1]);//200
		System.out.println(a[2]);//300
	}
}
