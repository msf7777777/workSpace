
public class day1111 {
	public static void m1(Cat a) {
		a.setAge(0);
	}
	
	public static void m2(Cat a) {
		a = new Cat("���ٷ�",28);
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat("�ż���",23);
		System.out.println(c1.getAge());//��23��
		
		m1(c1);
		System.out.println(c1.getAge());//��0��
		
		m2(c1);
		System.out.println(c1.getAge());//��0��
	}
}
