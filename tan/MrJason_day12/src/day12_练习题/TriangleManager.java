package day12_��ϰ��;
//��д��Triangle������private���������ԣ��ױ߳�base�͸�height
//ͬʱ�ṩgetter��setter
//��TriangleManager���ж���һ������public static double getArea��Triangle t�����������ε����������main���������

public class TriangleManager {
	public static double getArea(Triangle t) {
		return t.getBase() * t.getHeight() / 2;
	}
	
	public static void main(String[] args) {
		double area = getArea(new Triangle(3.0, 2.0));
		System.out.println(area);
	}
}
