package No04_��������ʵ��������;
//������󴴽�֮ǰ�������и������
//�������Ĺ�����Ĭ�ϻ���ø�����޲ι��������Ա㴴������Ķ���

class Person {
	String name;
	int age;
	public Person() {
	// this();
	// super();д��д���У������д��Ĭ��Ҳ�����super();
	super();// ���ø�����޲ι�����
	System.out.println("Person������");
	}
	public void info() {
	System.out.println("�ҽ�" + name + "���ҽ���" + age + "����");
	}
}

class Student extends Person {
	// ѧ��
	int sno;
	public Student(String name,int age,int sno) {
	// ������󴴽�֮ǰ�������и������
	// �������Ĺ�����Ĭ�ϻ���ø�����޲ι��������Ա㴴������Ķ���
	// super()���ø�����޲ι�����
	//����������У���������Ա���ʼ�������Ǹ��������û�б���ʼ�����и����ַ�ʽ���Խ���� ��һ�֣��������
	//��������ֱ�ӳ�ʼ���Ӹ���̳е����ԡ�
	super();// д��д��һ����Ĭ�ϻ���ø�����޲ι�����
	System.out.println("Student������");
	this.name = name;
	this.age = age;
	this.sno = sno;
//	System.out.println("�ҽ� " + name + "  �������� " + age);
	}
	
	public void study() {
//	System.out.println("�ҵ�������" + sno);
	System.out.println("�ú�ѧϰ����������");
	}
}

public class day1206 {
	public static void main(String[] args) {
		//�����������󣬸��������������
		Student s = new Student("�ż���", 23, 20190001);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sno);
		s.study();
	}
}
