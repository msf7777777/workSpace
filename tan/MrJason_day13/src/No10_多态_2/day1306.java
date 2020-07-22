package No10_多态_2;

class Animal {
	public void bark() {
		System.out.println("不知道");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("汪汪汪");
	}
	public void run() {
		System.out.println("run");
	}
}

public class day1306 {
	public static void main(String[] args) {
		//变量的类型是Animal，对象的类型是Dog
		Animal a1 = new Dog();
		//运行时看对象的类型
		a1.bark();//【汪汪汪】
		System.out.println("----------【1】----------");
		//编译时看变量的类型，只能看到Animal类的方法，看不到实际引用对象的方法
		//  a1.run();
		// 变量类型是Animal，它只能调用bark方法，但却不能调用run方法。
		// a1.run();//编译错误,编译时看变量的类型
		Dog d1 = new Dog();
		a1.equals(d1);
		d1.run();
		System.out.println("----------【2】----------");
		// 可以使用强制类型转换将变量a1的变量类型转换为Dog，这样就能调用run方法。
		Dog a2 = (Dog) a1;
		a2.run();// 正确
		System.out.println("----------【3】----------");
		Animal a3 = new Animal();
		// 可以使用强制类型转换将a3的变量类型转换为Dog
		// 但是a3,a4实际引用的是Animal类型的对象，而此对象没有run方法。
		System.out.println("----------【4】----------");
		Dog a4 = (Dog) a3;
		System.out.println("----------【5】----------");
		a4.run();// 运行时错误，没有run方法。
		System.out.println("----------【6】----------");
	}
}
