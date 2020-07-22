package No13_接口;

/* 【接口】
 * 接口定义了一个类所能对外提供的功能。
 * 接口不能被实例化，只能被实现。 
 * 接口可以理解为纯粹的抽象类，接口中
 * 的所有方法都是抽象的。 接口描述了一种规则。*/

//使用关键字interface声明一个接口。接口声明功能。
interface Flyable {
	// public abstract 不是必须的，接口的方法默认是public abstract。
	// public abstract void fly();
	void fly();
	public abstract void fuck();//这样也是可以的
}

//使用关键字implements来实现一个接口。类实现接口中声明的功能。
class Aeroplane implements Flyable {
	//实现一个接口，必须实现接口中的所有方法，否则此类必须声明为抽象类
	@Override
	public void fly() {
		System.out.println("飞机能飞，飞机使用发动机飞");
	}
	
	public void fuck() {
		System.out.println("我还能fuck");
	}
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("鸟能飞，鸟使用翅膀飞");
	}
	
	public void fuck() {
		System.out.println("我也能fuck");
	}
}

abstract class Zjm implements Flyable {
	//实现一个接口，如果没有实现接口中的所有方法，否则此类必须声明为抽象类
}

public class day1309 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();//【鸟能飞，鸟使用翅膀飞】
		System.out.println("----------【1】----------");
		
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();//【飞机能飞，飞机使用发动机飞】
		System.out.println("----------【2】----------");
		
		//接口类型的变量可以引用实现了这个接口的类的实例
		Flyable flyable1 = new Bird();//Bird实现了Flyable接口，因此这个对象可以被flyable1引用
		flyable1.fuck();//【我也能fuck】多态，会调用其引用对象的fly方法
		System.out.println("----------【3】----------");
		
		Flyable flyable2 = new Aeroplane();//Aeroplane实现了Flyable接口，因此这个对象可以被flyable1引用
		flyable2.fuck();//【我还能fuck】多态，会调用其引用对象的fly方法
		System.out.println("----------【4】----------");
	}
	
}
