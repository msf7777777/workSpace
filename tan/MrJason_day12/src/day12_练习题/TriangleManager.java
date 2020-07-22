package day12_练习题;
//编写类Triangle，申明private的两个属性：底边长base和高height
//同时提供getter和setter
//在TriangleManager类中定义一个方法public static double getArea（Triangle t）计算三角形的面积，并在main方法中输出

public class TriangleManager {
	public static double getArea(Triangle t) {
		return t.getBase() * t.getHeight() / 2;
	}
	
	public static void main(String[] args) {
		double area = getArea(new Triangle(3.0, 2.0));
		System.out.println(area);
	}
}
