package Diary0618;

public class day05_01_2JingZhi {
	public static void main(String[] args) {
		System.out.println(2147483647 + 1);//��-2147483648��
		System.out.println(2147483647 + 2);//��-2147483647��
		System.out.println(2147483647 + 1 + 1);//��-2147483647��
		
		// 2147483647 = 01111111111111111111111111111111
		//-2147483648 = 10000000000000000000000000000000
		//
		
		
		int a = 10;
		int b = 20;
		a = b;
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		b = a;
		System.out.println(a);
		System.out.println(b);
		
		char c = 'a';
		System.out.println(c);
		
		System.out.println("�������ٷ�");
		
		
		
		
	}
}
