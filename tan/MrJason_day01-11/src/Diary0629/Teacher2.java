package Diary0629;

public class Teacher2 {
	String name;
	int age;
	public void set(String newName,int age) {
		//给调用此方法的对象的name属性赋值
		name = newName;
		//在实例方法中，this代表调用此方法的对象
		//给调用此方法的对象的age属性赋值
		age = age;
		
		System.out.println(this);
	}
}
