package Diary0629;

public class day0718_02_GouZaoQi_01_01 {
	public static void main(String[] args) {
		//当使用new操作符创建类的一个实例时候，构造器就会被调用。
		//没有构造器不能创建对象，如果没有构造器，编译器会提供一个默认的无参构造器
		Student p1 = new Student();
		Student p2 = new Student();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("----------【1】----------");
		
		//调用有参构造器
		Student p3 = new Student("张嘉敏",23);
		Student p4 = new Student("麻少飞",28);
		
		System.out.println(p3.name);
		System.out.println(p4.age + "(" + p4.name + ")");
		
		System.out.println("----------【2】----------");
		
		p3.showInfo();
		System.out.println("----------【3】----------");
		p4.showInfo();
		
		System.out.println("---------【end】---------");
	}
}
