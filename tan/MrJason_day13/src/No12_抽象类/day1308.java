package No12_������;

/*������
ͼ�ζ��󶼾���ĳЩ���ԣ�λ�ã��ͷ�����moveTo��draw����
�������е�ͼ�Σ���Щ���Ժͷ����е�һЩ����ͬ��λ�ã�moveTo����
draw��Щ���⡣ÿ�������draw�����ṩ�Ĺ��ܲ�ͬ��
�����ڸ������ṩһ��draw��������������ʹ�÷�����д������ض���draw������*/

//������������������������������������������������������������������������//
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
		System.out.println("x = " + x + "��y = " + y);
	}
	void draw() {
	// ��ȷ��Ҫ��ʲô���޷�ʵ��
	}
}
//������������������������������������������������������������������������//
class Circle extends GraphicObject {
	Circle(int x, int y) {
		super(x, y);
	}
	public void draw() {
		System.out.println("��һ��Բ[" + x + "," + y + "]");
	}
}
//������������������������������������������������������������������������//
class Rectangle extends GraphicObject {
	Rectangle(int x, int y) {
		super(x, y);
	}
	public void draw() {
		System.out.println("��һ������[" + x + "," + y + "]");
	}
}
//��������������������������������  Main ��������������������������������//
public class day1308 {
	public static void main(String[] args) {
		// ͼ��Ӧ���ǳ���ģ���Ӧ���о���Ķ���
		//  GraphicObject g = new GraphicObject(0, 0);
		Circle c = new Circle(0, 2);
		c.showLocation();
		c.draw();
		System.out.println("----------��1��----------");
		
		Rectangle r = new Rectangle(5, 6);
		r.showLocation();
		r.draw();
		System.out.println("----------��2��----------");
	}
}
//������������������������������������������������������������������������//
/* ����������д����������⣺ GraphicObject���draw�����ڲ��ǿյģ� 
 * �˷���Ӧ�ô��ڣ���Ϊ����ͼ�ζ�Ӧ����draw������
 * ���Ƕ��ڻ���GraphicObject�������ֲ�֪�����ʵ�ָ÷����� 
 * GraphicObject��ͼ�Σ�Ӧ���ǳ���ģ���Ӧ���о���Ķ���
 * �����������������ʹ�ó�������ʵ�ָ������š�*/
//������������������������������������������������������������������������//