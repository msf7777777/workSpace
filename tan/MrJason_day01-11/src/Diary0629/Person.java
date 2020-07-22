
package Diary0629;

public class Person {
	String name;//实例变量
	char gender;//实例变量
	int age;//实例变量
	static int count;//类变量
	
	//实例方法
	//实例方法可以操作调用此方法的对象的实例属性
	//
	public void showInfo() {
		System.out.println("我叫：" + name);
		System.out.println("我的性别是：" + gender);
		System.out.println("我今年：" + age + "岁了");
		
		//实例方法可以访问类变量
		System.out.println("有" + count + "个对象");
	}
	
	//类方法
	//类方法用于操作类变量
	public static void setCount(int newCount) {
		count = newCount;
		
		//类方法不能访问实例变量
//		System.out.println(name);//编译错误
	}
	
	//类方法
	//类方法用于操作类变量
	public static int getCount() {
		return count;
	}
	
}
