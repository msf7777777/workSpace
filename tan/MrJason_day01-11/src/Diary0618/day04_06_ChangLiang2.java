package Diary0618;

public class day04_06_ChangLiang2 {
	public static void main(String[] args) {
		int value1 = 7;//��ֵ���
		int value2 = value1 * value1;
		System.out.println(value2);//��49��
		
		int valueA = 7;
		//valueA = 8;
		final int valueB = valueA * valueA;
		int valueC = valueA + valueA;
		System.out.println(valueB);//��49��
		System.out.println(valueC);//��14��
		
		valueA = 6;
		System.out.println(valueA);//��6��
		System.out.println(valueB);//��49��
		System.out.println(valueC);//��14��
		
		//������ valueB = valueA * valueA;
		valueC = valueA + valueA;
		System.out.println(valueC);//��12��
		
		int a = 5,b = 6;
		b = a;
		System.out.println(b);//��5��
		
		final int c = 10;
		b = c;
		System.out.println(b);//��10��
		
		b = a + a + a;
		System.out.println(b);//��15��
		
		a = 2;
		System.out.println(b + a);//��17��
		System.out.println(a + a + a + a);//��8��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}