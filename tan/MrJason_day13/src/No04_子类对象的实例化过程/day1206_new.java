package No04_��������ʵ��������;
//������󴴽�֮ǰ�������и������
//�������Ĺ�����Ĭ�ϻ���ø�����޲ι��������Ա㴴������Ķ���

class Person1 {
	String name;
	int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person������");
	}
	public void info() {
		System.out.println("�ҽ�" + name + "���ҽ���" + age + "����");
	}
}

class Student1 extends Person1 {
	// ѧ��
	int sno;
	public Student1(String name,int age,int sno) {
		//���ø�����޲ι���������name��age���и�ֵ
		super(name, age);// д��д��һ����Ĭ�ϻ���ø�����޲ι�����
		this.sno = sno;
		System.out.println("Student������");
	}
	
	public void study() {
		System.out.println("�ú�ѧϰ����������");
	}
}

public class day1206_new {
	public static void main(String[] args) {
		//�����������󣬸��������������
		System.out.println("-------���ָ��ߡ�-------");
		Student1 s = new Student1("�ż���", 23, 19960122);
		System.out.println("-------���ż�����-------");
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sno);
		s.study();
		System.out.println("-------���ָ��ߡ�-------");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("-------���ָ��ߡ�-------");
		Student1 s1 = new Student1("���ٷ�", 28, 19901113);
		System.out.println("-------�����ٷɡ�-------");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.sno);
		s1.study();
		System.out.println("-------���ָ��ߡ�-------");
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
