package No10_��̬_2;

class Animal {
	public void bark() {
		System.out.println("��֪��");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("������");
	}
	public void run() {
		System.out.println("run");
	}
}

public class day1306 {
	public static void main(String[] args) {
		//������������Animal�������������Dog
		Animal a1 = new Dog();
		//����ʱ�����������
		a1.bark();//����������
		System.out.println("----------��1��----------");
		//����ʱ�����������ͣ�ֻ�ܿ���Animal��ķ�����������ʵ�����ö���ķ���
		//  a1.run();
		// ����������Animal����ֻ�ܵ���bark��������ȴ���ܵ���run������
		// a1.run();//�������,����ʱ������������
		Dog d1 = new Dog();
		a1.equals(d1);
		d1.run();
		System.out.println("----------��2��----------");
		// ����ʹ��ǿ������ת��������a1�ı�������ת��ΪDog���������ܵ���run������
		Dog a2 = (Dog) a1;
		a2.run();// ��ȷ
		System.out.println("----------��3��----------");
		Animal a3 = new Animal();
		// ����ʹ��ǿ������ת����a3�ı�������ת��ΪDog
		// ����a3,a4ʵ�����õ���Animal���͵Ķ��󣬶��˶���û��run������
		System.out.println("----------��4��----------");
		Dog a4 = (Dog) a3;
		System.out.println("----------��5��----------");
		a4.run();// ����ʱ����û��run������
		System.out.println("----------��6��----------");
	}
}
