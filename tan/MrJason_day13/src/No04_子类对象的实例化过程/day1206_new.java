package No04_子类对象的实例化过程;
//子类对象创建之前必须先有父类对象
//子类对象的构造器默认会调用父类的无参构造器，以便创建父类的对象。

class Person1 {
	String name;
	int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person构造器");
	}
	public void info() {
		System.out.println("我叫" + name + "，我今年" + age + "岁了");
	}
}

class Student1 extends Person1 {
	// 学号
	int sno;
	public Student1(String name,int age,int sno) {
		//调用父类的无参构造器，对name和age进行赋值
		super(name, age);// 写不写都一样，默认会调用父类的无参构造器
		this.sno = sno;
		System.out.println("Student构造器");
	}
	
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}

public class day1206_new {
	public static void main(String[] args) {
		//创建两个对象，父类对象和子类对象
		System.out.println("-------【分割线】-------");
		Student1 s = new Student1("张嘉敏", 23, 19960122);
		System.out.println("-------【张嘉敏】-------");
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sno);
		s.study();
		System.out.println("-------【分割线】-------");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("-------【分割线】-------");
		Student1 s1 = new Student1("麻少飞", 28, 19901113);
		System.out.println("-------【麻少飞】-------");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.sno);
		s1.study();
		System.out.println("-------【分割线】-------");
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
