package No03_�̳�;

class Person {
	String name;
	int age;
	
	public void info() {
		System.out.println("�ҽ�" + name + "���ҽ���" + age + "����");
	}
}

//extends �ؼ��������̳�һ����
//Student����Person������࣬Person����Student��ĸ���
//Student��̳���Person���ж�������Ժͷ���
//Student�����������ԣ���������
class Student extends Person {
	//ѧ��
	int sno;
	public void study() {
		System.out.println("�ú�ѧϰ����������");
	}
}

//Actor��̳���Person��һ����������ж�����࣬һ������ֻ����һ������
class Actor extends Person {
	//нˮ
	long salary;
	public void act() {
		System.out.println("���Ȱ�����");
		System.out.println("�ҵ���������" + salary / 100000000 + "��ڤ��\n"
				         + "���Ǵ�ɵ��");
	}
}

public class day1205 {
	public static void main(String[] args) {
		Student s = new Student();
		// name��age���Լ̳���Person
		s.name = "�ż���";
		s.age = 23;
		// sno��Student���ж��������
		s.sno = 19960122;
		// info�����̳���Person
		s.info();
		// study������Student���ж���ķ���
		s.study();
		
		System.out.println("----------��1��----------");
		
		Actor a = new Actor();
		// name��age���Լ̳���Person
		a.name = "����ΰ";
		a.age = 500;
		// salary��Actor���ж��������
		a.salary = 1000000000;
		// info�����̳���Person
		a.info();
		// act������Actor���ж���ķ���
		a.act();
		System.out.println("----------��2��----------");
	}
}
