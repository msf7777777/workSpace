package No06_练习;
/*
编写一个Person类，包括属性（name、age），
有参构造器、方法say(返回自我介绍的字符串）。 
编写一个Student类，继承Person类，增加sno、score属性，
以及有参构造器，在子类中调用父类的构造器。
*/
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String say() {
		return "我叫：" + name + "\n"
	         + "我的年龄：" + age + "周岁" + "\n";
	}
	
	public String fuck() {
		return "我" + name + "是渣渣" + "\n"
			 + "我" + name + "其实" + (age + 50) + "岁了" + "\n";
	}
	
	public String nameZjm() {
		return name;
	}
}
