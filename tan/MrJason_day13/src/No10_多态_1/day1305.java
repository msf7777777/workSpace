package No10_��̬_1;

//��̬��ָ��ִ��ͬһ������ȴ������ͬ����Ϊ��
//��̬��ǰ���Ǽ̳кͷ�����д��
//��̬��ִ���ĸ��������������õĶ�������ͣ������Ǳ��������͡�

class Animal {
	public void bark() {
		System.out.println("��֪��");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("������");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("������");
	}
}

public class day1305 {
	public static void main(String[] args) {
		// ִ��ͬһ������ȴ������ͬ����Ϊ��
		/*a1���õ���Animal���͵Ķ���
		    ��˻����Animal���bark����������ʱ����������͡�*/
		Animal a1 = new Animal();
		/*a2���õ���Dog���͵Ķ��� ��˻����Dog���bark������
		    ����ʱ����������͡�*/
		Animal a2 = new Dog();
		/*a3���õ���Cat���͵Ķ�����˻����Cat���bark������ 
		    ����ʱ����������͡�*/
		Animal a3 = new Cat();
		a1.bark();//����֪�������õ���Animal��bark����
		a2.bark();//�������������õ���Dog��bark����
		a3.bark();//�������������õ���Cat��bark����
		System.out.println("----------��1��---------");
		
		// ִ��ͬһ������ȴ������ͬ����Ϊ��
		Animal[] arr = { new Animal(), new Dog(), new Cat() };
		// ����ʵ�����õĶ���ķ���
		arr[0].bark();// ��֪��
		arr[1].bark();// ������
		arr[2].bark();// ������
		System.out.println("----------��2��---------");
	}
}
