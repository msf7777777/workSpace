package Diary0629;

public class Animal2 {
	String name;
	int age;
	char gender;
	int number;
	
	public Animal2(String name,char gender,int number) {
		this.name = name;
		this.gender = gender;
		this.number = number;
	}
	
	public Animal2(String name,int age) {
		//��������Ĺ�����
		this(name,gender,number);
		this.age = age;
	}
}
