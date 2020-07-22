package Diary0629;

public class Animal {
	String name;
	int age;
	String type;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name,int age) {
		//调用上面的构造器
		this(name);
		this.age = age;
	}
	
	public Animal(String name,int age,String type) {
		//调用上面的构造器
		this(name,age);
		this.type = type;
	}
	
	public void showInfo() {
		System.out.println("我叫 " + name);
		System.out.println("我今年 " + age + "岁了");
		System.out.println("我是 " + type + " 这么个玩意儿");
	}
	
}
