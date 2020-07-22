package No03_继承;

class Person {
	String name;
	int age;
	
	public void info() {
		System.out.println("我叫" + name + "，我今年" + age + "岁了");
	}
}

//extends 关键字用来继承一个类
//Student类是Person类的子类，Person类是Student类的父类
//Student类继承了Person类中定义的属性和方法
//Student类有三个属性，两个方法
class Student extends Person {
	//学号
	int sno;
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}

//Actor类继承于Person，一个父类可以有多个子类，一个子类只能有一个父类
class Actor extends Person {
	//薪水
	long salary;
	public void act() {
		System.out.println("我热爱表演");
		System.out.println("我的秒收入是" + salary / 100000000 + "亿冥币\n"
				         + "我是大傻逼");
	}
}

public class day1205 {
	public static void main(String[] args) {
		Student s = new Student();
		// name和age属性继承于Person
		s.name = "张嘉敏";
		s.age = 23;
		// sno是Student类中定义的属性
		s.sno = 19960122;
		// info方法继承于Person
		s.info();
		// study方法是Student类中定义的方法
		s.study();
		
		System.out.println("----------【1】----------");
		
		Actor a = new Actor();
		// name和age属性继承于Person
		a.name = "梁朝伟";
		a.age = 500;
		// salary是Actor类中定义的属性
		a.salary = 1000000000;
		// info方法继承于Person
		a.info();
		// act方法是Actor类中定义的方法
		a.act();
		System.out.println("----------【2】----------");
	}
}
