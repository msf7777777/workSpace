package Diary0629;

public class Animal {
	String name;
	int age;
	String type;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name,int age) {
		//��������Ĺ�����
		this(name);
		this.age = age;
	}
	
	public Animal(String name,int age,String type) {
		//��������Ĺ�����
		this(name,age);
		this.type = type;
	}
	
	public void showInfo() {
		System.out.println("�ҽ� " + name);
		System.out.println("�ҽ��� " + age + "����");
		System.out.println("���� " + type + " ��ô�������");
	}
	
}
