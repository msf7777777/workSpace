package Diary0618;

public class day04_06_ChangLiang2 {
	public static void main(String[] args) {
		int value1 = 7;//¸³ÖµÓï¾ä
		int value2 = value1 * value1;
		System.out.println(value2);//¡¾49¡¿
		
		int valueA = 7;
		//valueA = 8;
		final int valueB = valueA * valueA;
		int valueC = valueA + valueA;
		System.out.println(valueB);//¡¾49¡¿
		System.out.println(valueC);//¡¾14¡¿
		
		valueA = 6;
		System.out.println(valueA);//¡¾6¡¿
		System.out.println(valueB);//¡¾49¡¿
		System.out.println(valueC);//¡¾14¡¿
		
		//´íÎó±à³Ì valueB = valueA * valueA;
		valueC = valueA + valueA;
		System.out.println(valueC);//¡¾12¡¿
		
		int a = 5,b = 6;
		b = a;
		System.out.println(b);//¡¾5¡¿
		
		final int c = 10;
		b = c;
		System.out.println(b);//¡¾10¡¿
		
		b = a + a + a;
		System.out.println(b);//¡¾15¡¿
		
		a = 2;
		System.out.println(b + a);//¡¾17¡¿
		System.out.println(a + a + a + a);//¡¾8¡¿
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}