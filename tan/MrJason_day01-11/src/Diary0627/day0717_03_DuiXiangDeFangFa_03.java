package Diary0627;

public class day0717_03_DuiXiangDeFangFa_03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "张三";
		System.out.println(p1.name);
		p1.name = "张三啊";
		System.out.println(p1.name);
		
		Foo f = new Foo();
		f.age = 10;
		f.count = 20;
		System.out.println("----------【1】----------");
		System.out.println(f.count);//【20】
		System.out.println(Foo.count);//【20】
		System.out.println("----------【2】----------");
		
		Foo.count = 30;
		System.out.println(f.count);//【30】
		System.out.println(Foo.count);//【30】
		System.out.println("----------【3】----------");
		
		f.count = 15;
		System.out.println(f.count);//【15】
		System.out.println(Foo.count);//【15】
		System.out.println("----------【4】----------");
		
		System.out.println(f.x);//【666】
		System.out.println(f.PI);//【3.141592653】
		System.out.println(Foo.PI);//【3.141592653】
		System.out.println("----------【5】----------");
		
		
	}
}
