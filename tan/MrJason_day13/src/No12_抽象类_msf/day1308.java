package No12_抽象类_msf;

/*抽象类
图形对象都具有某些属性（位置）和方法（moveTo，draw）。
对于所有的图形，这些属性和方法中的一些是相同（位置，moveTo）。
draw有些特殊。每个子类的draw方法提供的功能不同。
可以在父类中提供一个draw方法，在子类中使用方法重写来完成特定的draw方法。*/

//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
//有抽象方法的类必须声明为抽象类，因此声明GraphicObject需要加关键字abstract。
//抽象类不能被实例化。
abstract class GraphicObject {
	protected int x;
	protected int y;
	public GraphicObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showLocation() {
		System.out.println("x = " + x + "，y = " + y);
	}
	//抽象方法，没有方法体
	//声明为抽象的方法，因为不知道如何实现它
	//如果父类申明了抽象的方法，那么子类就必须要实现它，因此这个方法对所有的自雷警星了约束
	abstract void draw();
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
class Circle extends GraphicObject {
	Circle(int x, int y) {
		super(x, y);
	}
	//子类必须实现父类的抽象方法，否则这个类必须声明为抽象类
	public void draw() {
		System.out.println("画一个圆[" + x + "," + y + "]");
	}
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
class Rectangle extends GraphicObject {
	Rectangle(int x, int y) {
		super(x, y);
	}
	
	//子类必须实现父类的抽象方法，否则这个类必须声明为抽象类
	public void draw() {
		System.out.println("画一个矩形[" + x + "," + y + "]");
	}
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓【  Main 】〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
public class day1308 {
	public static void main(String[] args) {
		// 图形应该是抽象的，不应该有具体的对象
		//抽象类不能创建对象
//		GraphicObject g = new GraphicObject(0, 0);
		
		Circle c = new Circle(0, 2);
		c.showLocation();
		c.draw();
		System.out.println("----------【1】----------");
		
		Rectangle r = new Rectangle(5, 6);
		r.showLocation();
		r.draw();
		System.out.println("----------【2】----------");
	}
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
/* 抽象类使用abstract来声明，它可以包含抽象方法，也可以不包含抽象方法。
 * 有时候声明为抽象类，但又不包含抽象方法，仅仅是为了避免被实例化。 
 * 抽象类无法被实例化，但是可以被继承。
 * 被abstract修饰的方法称为抽象方法，抽象方法只有声明，没有实现。
 * 如果一个类包含了抽象方法，那它必须被声明为一个抽象类。
 * 如果一个类继承了抽象类，它通常需要实现抽象类的抽象方法，
 * 如果没有，那这个子类也必须被声明为抽象的。
 * 抽象类天生就是用来被继承的。
 * 抽象类实现了它所有子类必须使用的通用方法，这样子类就可以直接继承使用。
 * 抽象方法则留给子类根据自己的情况做不同的实现。 
 * 定义抽象方法的意义在于：
 * 给所有的子类制定一种规则，子类必须要实现抽象方法。*/
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//