package Diary0619;

public class day06_06_ShuJvZhuanHuan {
	public static void main(String[] args) {
		long number1 = 1689;
//		int number2 = number1;// ������� long��������ת��int
		int number2 = (int)number1;//()����ǿ��ת��longΪint
		System.out.println(number2);//��1689��
		
		long number3 = 2147483648L;
		int number4 = (int)number3;
		System.out.println(number4);//��-2147483648�����ݶ�ʧ
		
		long a = 2147483648L;
		int b = (int)a;
		System.out.println(b);//��-2147483648��
		
		b = 2147483647;
		System.out.println(b);//��2147483647��
		
//		int x = 88.99;// �������
		int x = (int)88.99;
		System.out.println(x);//��88��ȥ��С����֮��ģ�������������
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
