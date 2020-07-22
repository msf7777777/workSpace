package Diary0629;

public class day0718_01_ChengYuanFangFa_01 {
	public static void main(String[] args) {
		//当时用new操作符创建类的一个实例时，构造器会被调用。
		//没有构造器不能创建对象，如果没有构造器，编译器会提供一个默认的无参构造器
		Person p1 = new Person();
		p1.name = "张三";
		p1.gender = '男';
		p1.age = 20;
		
		Person.setCount(1);//通过类名调用类方法
		
		p1.showInfo();//通过对象调用实例方法
		
		System.out.println("**********【1】**********");
		
		Person p2 = new Person();
		p2.name = "李四";
		p2.gender = '女';
		p2.age = 21;
		
		Person.setCount(Person.getCount() + 1);//通过类名调用类方法
		
		p2.showInfo();//通过对象调用实例方法
		
		System.out.println("有" + Person.getCount() + "个对象");
		
		
		
	}
}
