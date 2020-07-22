package No07_继承的规则_2_msf;

public class Dog extends Animal {
	private int age;

	public Dog(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void say() {
		System.out.println("我叫" + getName() + "我今年" + age + "岁了");
	}
}
