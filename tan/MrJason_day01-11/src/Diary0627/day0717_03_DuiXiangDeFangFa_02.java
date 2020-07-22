package Diary0627;

public class day0717_03_DuiXiangDeFangFa_02 {
	public static void main(String[] args) {
		Person per = new Person();
		per.name = "张三";
		//调用对象p的getName方法，将获取对象p的name属性，并将其作为返回值赋值给name变量
		String name = per.getName();
		System.out.println(name);//【张三】
		
		Person p1 = new Person();
		p1.name = "李四";
		//调用对象p1的getName方法，将获取对象p1的name属性，并将其作为返回值赋值给name变量
		String name1 = p1.getName();
		System.out.println(name1);//【李四】
		
		//调用对象p的setName方法，将“张三1”
		per.setName("张三三");
		//调用对象p1的setName方法，将“李四1”作为参数传递过去
		p1.setName("李四四");
		
		System.out.println(per.getName());//【张三三】
		System.out.println(p1.getName());//【李四四】
		
		System.out.println(per.name);//【张三三】
		System.out.println(p1.name);//【李四四】
		
	}
}
