package Diary0629;

public class Teacher {
	String name;
	int age;
	
	public Teacher(String name,int age) {
		//调用构造器时，还没有被创建出来
		//在构造器中this代表当前被创建的对象
		this.name = name;
		this.age = age;
		System.out.println(this);
	}
	
	public void setName(String newName) {
		//给调用此方法的对象的name属性赋值
//		name = newName;
		//在实例方法中，this代表调用此方法的对象
		this.name = newName;
		
		System.out.println(this);
	}
	
	public void setAge(int age) {
//		age = age;//无法给对象的age属性赋值
		this.age = age; 
		
		
	}
}
