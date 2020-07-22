package day12_练习题;

import java.util.Scanner;

public class TriangleManager_msf {
	public static double getArea(Triangle t) {
		return t.getBase() * t.getHeight() / 2;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("№ 输入_三角形的底边长 №");
		double base = s.nextDouble();
		
		System.out.println("№ 输入_三角形的高 №");
		double height = s.nextDouble();
		
		s.close();
		
		double area = getArea(new Triangle(base, height));
		System.out.println("----------【】----------");
		System.out.println("-----【三角形の面积是】-----");
		System.out.println(area);
	}
}
