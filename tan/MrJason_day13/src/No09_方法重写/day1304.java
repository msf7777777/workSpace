package No09_������д;

//������Դ����ͳ���ӵ��ͬ��ǩ�����������Ͳ����б��ķ����������������д��
/*
������д�Ĺ���
������д�ķ������ܱȳ����и�С�ķ���Ȩ�ޡ�
�����Ϊfinal�ķ������ܱ���д��
����д�ķ����п���ʹ��super�ؼ����������䳬��ķ�����
��д�����ķ���ֵ���Ͳ��ܱȸ���Ĵ�
����ֻ����д���ɼ��ķ����� 
static��Ա�����Ǽ̳����⣬��˲��ܱ���д��
*/

class Animal {
	public void bark() {
		System.out.println("��TM֪��");
	}
	
	public String fuck() {
		return "��֪��";
	}
}

//�����Ϊfinal�ķ������ܱ���д��
//class Animal {
//	public final void bark() {
//		System.out.println("��֪��");
//	}
//}

class Cat extends Animal {
	//��д��Animal���bark����
	public void bark() {
		System.out.println("������");
	}
	
//	��д�����ķ���ֵ���Ͳ��ܱȸ���Ĵ�
//	public Object fuck() {
//		Object o = "������";
//	}
	public String fuck() {
		String o = "������";
		return o;
	}
	
	//������д�ķ������ܱȳ����и�С�ķ���Ȩ�ޡ�
//	private void bark() {
//		System.out.println("������");
//	}
	
	public void fucker() {
		super.bark();
	}
}

public class day1304 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.bark();//��������~��
		c.fucker();
	}
}
