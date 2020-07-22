package No02_对象初始化;
class Fuck {
	private String name = setDefaultName();// 声明变量的时候赋值
	private int age = 0;// 声明变量的时候赋值
	// 类变量
	// 记录创建对象的个数
	public static int COUNT;
	// 静态代码块
	// 静态代码块在类被加载时执行
	// 每个类只被加载一次，因此静态代码块只执行一次
	// 静态代码块用来初始化静态字段(类变量)
	// 不能访问实例字段
	static {
	COUNT = 0;
	System.out.println("----------【1】----------");
	System.out.println("静态代码块执行 " + "COUNT = " + COUNT);
	}
	// 非静态代码块
	// 非静态代码块在每次创建对象的时候执行
	// 非静态代码块用来初始化实例字段
	
	{
	System.out.println("----------〓3〓----------");
	System.out.println("非静态代码块执行");
	COUNT++;
	}
	
	public Fuck() {
	System.out.println("----------〓4〓----------");
	System.out.println("默认构造器执行");
	}
	
	private String setDefaultName() {
	System.out.println("----------〓2〓----------");
	System.out.println("setDefaultName()");
	return "defaultName";
	}
	
	public Fuck(String name, int age) {
	this.name = name;
	this.age = age;
	}
	public String getName() {
	return name;
	}
	public int getAge() {
	return age;
	}
}
public class day1203_msf {
	public static void main(String[] args) {
		//1，加载类，执行静态代码块（只加载一次）
		//2，执行成员变量的赋值语句
		//3，执行非静态代码块
		//4，调用构造器 or dont（没有赋值的情况下调用构造器默认值）
		//5，执行main方法中输出语句
		
		//ctrl + f查找和替换
		Fuck Fuck1 = new Fuck();
		System.out.println("----------【5】----------");
		System.out.println(Fuck1.getName());
		System.out.println("----------【6】----------");
		System.out.println(Fuck1.getAge());
		System.out.println("----------【7】----------");
		System.out.println("COUNT = " + Bar.COUNT );//【COUNT = 1】
		System.out.println();
		System.out.println();
		
		Fuck Fuck2 = new Fuck("琴痴",28);
		System.out.println("----------【8】----------");
		System.out.println(Fuck2.getName());
		System.out.println("----------【9】----------");
		System.out.println(Fuck2.getAge());
		System.out.println("----------【0】----------");
		System.out.println("COUNT = " + Bar.COUNT );//【COUNT = 2】
		System.out.println();
		System.out.println();
		
		Fuck Fuck3 = new Fuck("尘汐",23);
		System.out.println("----------【J】----------");
		System.out.println(Fuck3.getName());
		System.out.println("----------【Q】----------");
		System.out.println(Fuck3.getAge());
		System.out.println("----------【K】----------");
		System.out.println("COUNT = " + Bar.COUNT );//【COUNT = 3】
		System.out.println();
		System.out.println();
		
	}
}
