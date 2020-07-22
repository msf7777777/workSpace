package No07_�̳еĹ���_2;

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
		System.out.println("----------����----------" + "\n"
				         + "����һ������" + "\n"
						 + "�ҽ� " + getName() + "\n"
	                     + "�ҽ��� " + age + "��" + "\n"
		     			 + "----------����----------" + "\n");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ����_���� ��");
		String animalName = s.next();
		int dogAge;
		System.out.println("�� ����_���� ��");
		dogAge = s.nextInt();
		s.close();
		if(dogAge >=0 && dogAge <= 100) {
			Dog d = new Dog(animalName, dogAge);
			d.setName(animalName);
			d.say();
		}else {
			System.out.println("----------����----------");
			System.out.println("����ɵ�ư���");
			System.out.println("----------����----------");
		}
	}
}
