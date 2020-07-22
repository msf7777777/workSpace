package No10_多态_1;

//多态是指：执行同一个方法却产生不同的行为。
//多态的前提是继承和方法重写。
//多态：执行哪个方法看的是引用的对象的类型，而不是变量的类型。

class Animal {
	public void bark() {
		System.out.println("不知道");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("汪汪汪");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("喵喵喵");
	}
}

public class day1305 {
	public static void main(String[] args) {
		// 执行同一个方法却产生不同的行为。
		/*a1引用的是Animal类型的对象，
		    因此会调用Animal类的bark方法，运行时看对象的类型。*/
		Animal a1 = new Animal();
		/*a2引用的是Dog类型的对象， 因此会调用Dog类的bark方法，
		    运行时看对象的类型。*/
		Animal a2 = new Dog();
		/*a3引用的是Cat类型的对象，因此会调用Cat类的bark方法， 
		    运行时看对象的类型。*/
		Animal a3 = new Cat();
		a1.bark();//【不知道】调用的是Animal的bark方法
		a2.bark();//【汪汪汪】调用的是Dog的bark方法
		a3.bark();//【喵喵喵】调用的是Cat的bark方法
		System.out.println("----------【1】---------");
		
		// 执行同一个方法却产生不同的行为。
		Animal[] arr = { new Animal(), new Dog(), new Cat() };
		// 调用实际引用的对象的方法
		arr[0].bark();// 不知道
		arr[1].bark();// 汪汪汪
		arr[2].bark();// 喵喵喵
		System.out.println("----------【2】---------");
	}
}
