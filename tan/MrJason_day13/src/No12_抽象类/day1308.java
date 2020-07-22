package No12_抽象类;

/*抽象类
图形对象都具有某些属性（位置）和方法（moveTo，draw）。
对于所有的图形，这些属性和方法中的一些是相同（位置，moveTo）。
draw有些特殊。每个子类的draw方法提供的功能不同。
可以在父类中提供一个draw方法，在子类中使用方法重写来完成特定的draw方法。*/

//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
class GraphicObject {
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
	void draw() {
	// 不确定要画什么，无法实现
	}
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
class Circle extends GraphicObject {
	Circle(int x, int y) {
		super(x, y);
	}
	public void draw() {
		System.out.println("画一个圆[" + x + "," + y + "]");
	}
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
class Rectangle extends GraphicObject {
	Rectangle(int x, int y) {
		super(x, y);
	}
	public void draw() {
		System.out.println("画一个矩形[" + x + "," + y + "]");
	}
}
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓【  Main 】〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//
public class day1308 {
	public static void main(String[] args) {
		// 图形应该是抽象的，不应该有具体的对象
		//  GraphicObject g = new GraphicObject(0, 0);
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
/* 上面的例子中存在两个问题： GraphicObject类的draw方法内部是空的， 
 * 此方法应该存在，因为所有图形都应该有draw方法。
 * 但是对于基类GraphicObject而言它又不知道如何实现该方法。 
 * GraphicObject（图形）应该是抽象的，不应该有具体的对象。
 * 对于这样的情况可以使用抽象类来实现更加优雅。*/
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓//