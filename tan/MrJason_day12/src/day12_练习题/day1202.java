package day12_练习题;
class Foo {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	String str;
}
//java中一个类文件可以有多个类，但是只能有一个public类
//public类的名称要和文件名相同
public class day1202 {
	public static void main(String[] args) {
		// int i;
		// System.out.println(i);//编译错误，i没有初始化
		Foo foo = new Foo();
		System.out.println(foo.b);//0
		System.out.println(foo.s);//0
		System.out.println(foo.c);//
		System.out.println(foo.i);//0
		System.out.println(foo.l);//0
		System.out.println(foo.f);//0.0
		System.out.println(foo.d);//0.0
		System.out.println(foo.bool);//false
		//null表示它不引用任何对象
		System.out.println(foo.str);//null String为引用类型，引用类型默认值为null
		}
	
}
