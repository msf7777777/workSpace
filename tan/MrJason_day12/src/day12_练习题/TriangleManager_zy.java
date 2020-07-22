package day12_练习题;

import java.util.Scanner;

public class TriangleManager_zy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年龄： （年龄必须在0-130之间）");
		System.out.println("您有三次机会，若输入错误，将fuck U");
		Bird b = new Bird();
		b.setAge(16);
		for (int i = 1; i < 4; i++) {
			b.setAge(s.nextInt());
			if(b.getAge() != 0) {
				System.out.println("你丫年龄是： " + b.getAge() + "周岁");
				break;
			}
		}
		
	}
}
//b.getAge() <= 130 && b.getAge() >= 0