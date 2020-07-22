package No00_临时;

/*
 编写一个Person类，包括属性（name、age），
有参构造器、方法say(返回自我介绍的字符串）。 
编写一个Student类，继承Person类，增加sno、score属性，
以及有参构造器，在子类中调用父类的构造器。
*/

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;//〓名字〓
		this.age = age;//〓年龄〓
	}
	
	public void saySomething() {
		System.out.println("〓励志〓  " + "我" + name + "要fuck" + age + "岁以下\n"
				         + "                年龄的童男童女，然后吃掉");
	}
}

class Student extends Person{
	int sno;//〓学号〓
	int score;//〓分数〓
	
	public Student(String name, int age, int sno, int score) {
		super(name, age);
		this.sno = sno;
		this.score = score;
	}
}

public class day1208 {
	public static void main(String[] args) {
		Student zjm = new Student("张嘉敏", 23, 19960122, 59);
		System.out.println("〓名字〓  " + zjm.name);
		System.out.println("〓年龄〓  " + zjm.age);
		System.out.println("〓学号〓  " + zjm.sno);
		System.out.println("〓分数〓  " + zjm.score);
		zjm.saySomething();
	}
}
