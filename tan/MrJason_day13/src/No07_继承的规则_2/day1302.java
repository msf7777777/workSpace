package No07_继承的规则_2;

import java.util.Scanner;

public class day1302 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("№ 输入_名字 №");
		String animalName = s.next();
		int dogAge;
		System.out.println("№ 输入_年龄 №");
		dogAge = s.nextInt();
		System.out.println("№ 输入_性别 №");
		String x = s.next();
		s.close();
		
		if(dogAge >=0 && dogAge <= 100) {
			Dog d = new Dog(animalName, dogAge);
			d.setName(animalName);
			d.say();
		}else {
			System.out.println("----------【】----------");
			System.out.println("你是傻逼啊？");
			System.out.println("----------【】----------");
		}
	}
}
