package No08_�̳еĹ���_3;

//�����͵ı����������������͵Ķ���

import java.util.Date;

class Animal {
}
class Pet extends Animal {
}
class Dog extends Pet {
}

public class day1303 {
	public static void main(String[] args) {
		// �����͵ı����������������͵Ķ���
		Animal a1 = new Pet();
		Animal a2 = new Dog();
		Pet a3 = new Dog();
		// ����Object����������ĳ��࣬���Object��ı������������κ����ʵ��
		Object o1 = new Animal();
		Object o2 = new String();
		Object o3 = new Date();
	}
}

//java�в�֧�ֶ�̳У���ֻ�ܼ̳�һ���ࡣ���ǿ���ʹ�ü̳���
//class Dog extends Animal, Pet { //�������
//}
