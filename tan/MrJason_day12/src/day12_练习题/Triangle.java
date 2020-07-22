package day12_练习题;
//编写类Triangle，申明private的两个属性：底边长base和高height
//同时提供getter和setter
//在TriangleManager类中定义一个方法public static double getArea（Triangle t）计算三角形的面积，并在main方法中输出
public class Triangle {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		if(base <= 0.0) {
			System.out.println("非法数据，你是傻逼");
			return;
		}
		this.base = base;
		if(height <= 0.0) {
			System.out.println("非法数据，你是傻逼");
			return;
		}
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if(base <= 0.0) {
			System.out.println("非法数据，你是傻逼");
			return;
		}
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height <= 0.0) {
			System.out.println("非法数据，你是傻逼");
			return;
		}
		this.height = height;
	}
	
}
