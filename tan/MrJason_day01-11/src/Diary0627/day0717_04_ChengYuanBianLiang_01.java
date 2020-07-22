package Diary0627;

public class day0717_04_ChengYuanBianLiang_01 {
	public static void main(String[] args) {
		//f的作用域和基本类型的作用域是一样的
		Foo f = new Foo();
		//实例变量是属于对象的，通过对象来访问
		f.age = 10;
		System.out.println(f.age);
		
		//类变量是属于类的，通过类名来访问
		Foo.count = 5;
		System.out.println(Foo.count);
		
		//类常量也是属于类的，通过类名来访问
		System.out.println(Foo.PI);
		
		//实例变量是属于对象的，实例变量的值是存放到对象中的，每个对象都有一份，跟别的对象的实例变量是相互独立的。
		//类变量是数月类的，类变量的值是存放在类中的，由于类只有一个，因此类变量只有一份
		//类常量也是属于类的，也是只有一份
		
		//类变量可以通过类名来访问，也可以通过对象来访问（不推荐）
		System.out.println(f.count);//编译警告
		
	}
}
