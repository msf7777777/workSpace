
public class day1111 {
	public static void m1(Cat a) {
		a.setAge(0);
	}
	
	public static void m2(Cat a) {
		a = new Cat("¬È…Ÿ∑…",28);
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat("’≈ºŒ√Ù",23);
		System.out.println(c1.getAge());//°æ23°ø
		
		m1(c1);
		System.out.println(c1.getAge());//°æ0°ø
		
		m2(c1);
		System.out.println(c1.getAge());//°æ0°ø
	}
}
