package Diary0627;

public class day0717_04_ChengYuanBianLiang_02 {
	public static void f(int n) {
		//n,x,y,p都是局部变量，它们的作用域都是从申明开始，到所属块结束后销毁
		//p所引用的对象是在使用new操作符时创建，那么它的属性也是在这个时候创建的
		//这个对象并不是在对象变量p销毁时销毁，它要等待垃圾回收器的回收
		int x = 0;
		if(x == 0) {
			int y = 0;
			
		}
		//p是对象变量，它引用了一个对象
		//new Person();创建出来一个对象，然后将对象的引用（地址）赋值给对象变量p
		//p引用了刚创建的对象
		Person p = new Person();
		
	}
	public static void main(String[] args) {
		f(1);
		new Person();//这就是一个匿名对象，没有任何变量引用它，因此它可能刚创建出来就被销毁了
		
	}
}
