package b;

import a.A1;
import a.A2;
import a.A3;
import a.A4;

public class day1109 {
	public static void main(String[] args) {
		A a = new A();//���ʲ��ˣ�A�ǲ�ͬ���µ��޹��࣬û��public����
		
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		A4 a4 = new A4();
		
		System.out.println(a1.age);//private
		System.out.println(a2.age);//public
		System.out.println(a3.age);//�����η�(default)
		System.out.println(a4.age);//protected
	}
}
