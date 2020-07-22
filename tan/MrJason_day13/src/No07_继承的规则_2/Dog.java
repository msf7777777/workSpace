package No07_继承的规则_2;

import java.util.Scanner;

public class Dog extends Animal{
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
		System.out.println("----------【】----------" + "\n"
				         + "我是一条旺旺" + "\n"
						 + "我叫 " + getName() + "\n"
	                     + "我今年 " + age + "岁" + "\n"
		     			 + "----------【】----------" + "\n");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("№ 输入_名字 №");
		String animalName = s.next();
		int dogAge;
		System.out.println("№ 输入_年龄 №");
		dogAge = s.nextInt();
		s.close();
		if(dogAge >=0 && dogAge <= 100) {
			Dog d = new Dog(animalName, dogAge);
			d.setName(animalName);
			d.say();
		}else {
			System.out.println("----------【】----------");
			System.out.println("你是傻逼啊？");
			System.out.println("----------【】----------");
		}
	}
}
