package No04_子类对象的实例化过程;
//子类对象创建之前必须先有父类对象
//子类对象的构造器默认会调用父类的无参构造器，以便创建父类的对象。

class Person {
	String name;
	int age;
	public Person() {
	// this();
	// super();写不写都行，如果不写，默认也会调用super();
	super();// 调用父类的无参构造器
	System.out.println("Person构造器");
	}
	public void info() {
	System.out.println("我叫" + name + "，我今年" + age + "岁了");
	}
}

class Student extends Person {
	// 学号
	int sno;
	public Student(String name,int age,int sno) {
	// 子类对象创建之前必须先有父类对象
	// 子类对象的构造器默认会调用父类的无参构造器，以便创建父类的对象
	// super()调用父类的无参构造器
	//上面的例子中，子类的属性被初始化，但是父类的属性没有被初始化。有个两种方式可以解决。 第一种：在子类的
	//构造器中直接初始化从父类继承的属性。
	super();// 写不写都一样，默认会调用父类的无参构造器
	System.out.println("Student构造器");
	this.name = name;
	this.age = age;
	this.sno = sno;
//	System.out.println("我叫 " + name + "  我年龄是 " + age);
	}
	
	public void study() {
//	System.out.println("我的囚号是" + sno);
	System.out.println("好好学习，天天向上");
	}
}

public class day1206 {
	public static void main(String[] args) {
		//创建两个对象，父类对象和子类对象
		Student s = new Student("张嘉敏", 23, 20190001);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sno);
		s.study();
	}
}
