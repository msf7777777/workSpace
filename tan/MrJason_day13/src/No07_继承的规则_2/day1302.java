package No07_�̳еĹ���_2;

import java.util.Scanner;

public class day1302 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ����_���� ��");
		String animalName = s.next();
		int dogAge;
		System.out.println("�� ����_���� ��");
		dogAge = s.nextInt();
		System.out.println("�� ����_�Ա� ��");
		String x = s.next();
		s.close();
		
		if(dogAge >=0 && dogAge <= 100) {
			Dog d = new Dog(animalName, dogAge);
			d.setName(animalName);
			d.say();
		}else {
			System.out.println("----------����----------");
			System.out.println("����ɵ�ư���");
			System.out.println("----------����----------");
		}
	}
}
