package Diary0629;

public class day0718_03_this_03_Animal {
	public static void main(String[] args) {
		Animal a1 = new Animal("�ż���",23,"����");
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.type);
		
		System.out.println("----------��1��----------");
		
		a1.showInfo();
		
		System.out.println("---------��end��---------");
	}
}
