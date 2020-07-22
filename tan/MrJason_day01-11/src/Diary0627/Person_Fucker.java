package Diary0627;

public class Person_Fucker {
	public static void main(String[] args) {
		//类是一种类型，可以创建出来很多对象
		//使用new操作符来创建一个Person类的对象p
		//因此对象p有四个属性name,age,gender,sno
		Person p = new Person();
		//为对象p的各个属性赋值
		p.name = "张三";
		p.age = 10;
		p.gender = '男';
		p.sno = 20191101;
		
		//输出对象p的各个属性
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.sno);
		
		//将对象p的age赋值给变量age
		int age = p.age;
		System.out.println(age);
		
	}
}
