package Diary0629;

public class Student {
//	默认的无参构造器就是下面的构造器
//	public Student() {
//		
//	}
	
	String name;
	int age;
	
	//如果提供了一个构造器，那么编译器就不会提供默认的无参构造器了
	//构造器的名称必须和类的名称相同
	//构造器没有返回值，并且不实用void
	public Student() {
		System.out.println("Student构造器");
	}
	
	//构造器可以重载
	//构造器可以有参数
	//构造器用于初始化对象
	public Student(String newName,int newAge) {
		name = newName;
		age = newAge;
		
	}
	
	public void showInfo() {
		System.out.println("我的名字叫 " + name);
		System.out.println("我今年 " + age + "周岁");
	}
	
}
