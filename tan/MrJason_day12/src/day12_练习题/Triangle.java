package day12_��ϰ��;
//��д��Triangle������private���������ԣ��ױ߳�base�͸�height
//ͬʱ�ṩgetter��setter
//��TriangleManager���ж���һ������public static double getArea��Triangle t�����������ε����������main���������
public class Triangle {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		if(base <= 0.0) {
			System.out.println("�Ƿ����ݣ�����ɵ��");
			return;
		}
		this.base = base;
		if(height <= 0.0) {
			System.out.println("�Ƿ����ݣ�����ɵ��");
			return;
		}
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if(base <= 0.0) {
			System.out.println("�Ƿ����ݣ�����ɵ��");
			return;
		}
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height <= 0.0) {
			System.out.println("�Ƿ����ݣ�����ɵ��");
			return;
		}
		this.height = height;
	}
	
}
