package Diary0627_01;

public class day072401 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "张三";
		d1.age = 23;
		d1.color = "红色";
		d1.type = "漯河";
		
		Dog d2 = new Dog();
		d2.name = "大麻";
		d2.age = 28;
		d2.color = "红色";
		d2.type = "忻州";
		
		System.out.println("----------【张嘉敏】----------");
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		System.out.println("----------【麻少飞】----------");
		System.out.println(d2.name);
		System.out.println(d2.age);
		System.out.println(d2.color);
		System.out.println(d2.type);
		
	}
}
