package Diary0623;

public class day09_03_ChongZai_02 {
	//a��b�Ǹ�����ͷ����Ǹ���
	public static int max(int a,int b){
		return a > b ? a : b;
	}
	public static double max(double a,double b){
		return a > b ? a : b;
	}
	public static void main(String[] args) {
		//�ڵ��÷�����ʱ�򣬱����������ʵ�ʲ��������Ͳ���ƥ��ķ���
		System.out.println(max(1,2));
		System.out.println(max(1.0,2.0));
	}
}
