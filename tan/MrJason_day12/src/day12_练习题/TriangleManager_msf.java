package day12_��ϰ��;

import java.util.Scanner;

public class TriangleManager_msf {
	public static double getArea(Triangle t) {
		return t.getBase() * t.getHeight() / 2;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� ����_�����εĵױ߳� ��");
		double base = s.nextDouble();
		
		System.out.println("�� ����_�����εĸ� ��");
		double height = s.nextDouble();
		
		s.close();
		
		double area = getArea(new Triangle(base, height));
		System.out.println("----------����----------");
		System.out.println("-----�������Τ�����ǡ�-----");
		System.out.println(area);
	}
}
