package Diary0629;

public class day0718_03_this_03_Animal {
	public static void main(String[] args) {
		Animal a1 = new Animal("’≈ºŒ√Ù",23,"ƒÒ»À");
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.type);
		
		System.out.println("----------°æ1°ø----------");
		
		a1.showInfo();
		
		System.out.println("---------°æend°ø---------");
	}
}
