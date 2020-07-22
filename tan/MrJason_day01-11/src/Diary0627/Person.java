package Diary0627;

//创建一个类Person
//Person是一种复杂的数据类型
//类相当于创建了一个模板
public class Person {
	String name;
	int age;
	char gender;
	int sno;
	
	//static方法是类方法，下面的方法是实例方法
	//static方法是通过类名调用的，实例方法是通过对象调用的
	//获取name属性
	//在哪个对象上调用getName方法，就返回那个对象的name属性
	public String getName() {
		//这里的name指的是调用此方法的对象的name
		return name;
	}
	
	//修改name属性为newName
	//在哪个对象上调用setName方法，就修改哪个对象的name属性
	public void setName(String newName) {
		//这里的name指的是调用此方法的对象的name
		name = newName;
	}
	
	public void showInfo() {
		System.out.println("我的名字是：" + name);
		System.out.println("我的性别是：" + gender);
		System.out.println("我的年龄是：" + age);
		
	}
}
