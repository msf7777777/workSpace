package No09_方法重写;

//子类可以创建和超类拥有同样签名（方法名和参数列表）的方法，这叫做方法重写。
/*
方法重写的规则
子类重写的方法不能比超类有更小的访问权限。
被标记为final的方法不能被重写。
在重写的方法中可以使用super关键字来调用其超类的方法。
重写方法的返回值类型不能比父类的大。
子类只能重写它可见的方法。 
static成员不考虑继承问题，因此不能被重写。
*/

class Animal {
	public void bark() {
		System.out.println("不TM知道");
	}
	
	public String fuck() {
		return "不知道";
	}
}

//被标记为final的方法不能被重写。
//class Animal {
//	public final void bark() {
//		System.out.println("不知道");
//	}
//}

class Cat extends Animal {
	//重写了Animal类的bark方法
	public void bark() {
		System.out.println("喵喵喵");
	}
	
//	重写方法的返回值类型不能比父类的大。
//	public Object fuck() {
//		Object o = "喵喵喵";
//	}
	public String fuck() {
		String o = "喵喵喵";
		return o;
	}
	
	//子类重写的方法不能比超类有更小的访问权限。
//	private void bark() {
//		System.out.println("喵喵喵");
//	}
	
	public void fucker() {
		super.bark();
	}
}

public class day1304 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.bark();//【喵喵喵~】
		c.fucker();
	}
}
