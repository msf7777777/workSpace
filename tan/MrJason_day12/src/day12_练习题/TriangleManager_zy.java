package day12_��ϰ��;

import java.util.Scanner;

public class TriangleManager_zy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���������䣺 �����������0-130֮�䣩");
		System.out.println("�������λ��ᣬ��������󣬽�fuck U");
		Bird b = new Bird();
		b.setAge(16);
		for (int i = 1; i < 4; i++) {
			b.setAge(s.nextInt());
			if(b.getAge() != 0) {
				System.out.println("��Ѿ�����ǣ� " + b.getAge() + "����");
				break;
			}
		}
		
	}
}
//b.getAge() <= 130 && b.getAge() >= 0