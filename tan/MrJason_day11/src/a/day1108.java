package a;

public class day1108 {
	//类可以使用“public”关键字，指这个类是公有的，可以被其他无关类访问（包括同一个包下的类和不同包下的类）
	//如果不加修饰符，则认为这个类是默认访问权限（包访问权限），可以被同一个包下的无关类访问。
	public static void main(String[] args) {
		A a = new A();
		
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		A4 a4 = new A4();
		
		System.out.println(a1.age);//private
		System.out.println(a2.age);//public
		System.out.println(a3.age);//无修饰符(default)
		System.out.println(a4.age);//protected
	}	
}
