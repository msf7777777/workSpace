package No05_继承的规则_1;

//静态成员（静态变量，静态常量，静态方法）不考虑继承问题，静态成员不能被继承。
//子类不能继承父类的private成员（属性和方法）。
//protected成员包括包访问权限，protected成员可以被同一个包下的所有类访问。
//protected成员可以被子类访问，不管这个子类和父类是否在同一个包下。
//子类可以继承对它可见的成员。
//子类可以继承父类的public，protected成员。
//如果子类和父类在同一个包下，子类还可以继承父类的default成员。
//构造器不是类的成员，因此无法被继承，但是子类可以使用super关键字调用其超类的构造器。
//子类可以声明和超类同名的字段，这将导致隐藏其超类的字段。

class Person{
	private String name;
	protected int age;
	int fuck;
	
	public void showInfo() {
		System.out.println(fuck);
	}

	public Person(String name, int age, int fuck) {
		super();
		this.name = name;
		this.age = age;
		this.fuck = fuck;
	}
}

class Student extends Person{
	private int sno;
	int fuck;
	
	public Student(String name, int age, int fuck1, int sno, int fuck2) {
		super(name, age, fuck1);
		this.sno = sno;
		fuck = fuck2;
	}

	public void showInfo() {
//		System.out.println("我的名字" + name);
		System.out.println("我的年龄" + age);
		System.out.println("我的学号" + sno);
		//子类将隐藏超类的同名字段
		System.out.println("我是：" + fuck);//访问的是子类的fuck
		System.out.println("父类对象的fuck：" + super.fuck);
		System.out.println("子类对象的fuck：" + this.fuck);
	}
}

public class day1207 {
	public static void main(String[] args) {
		Student s = new Student("张嘉敏", 23, 666, 19960122, 777);
//		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.fuck);
//		System.out.println(s.sno);
		s.showInfo();
		
		System.out.println("----------【】----------");
		
		Person p = new Person("麻少飞", 28, 5427187);
		p.showInfo();
		
	}
}
