package No00_��ʱ;

/*
 ��дһ��Person�࣬�������ԣ�name��age����
�вι�����������say(�������ҽ��ܵ��ַ������� 
��дһ��Student�࣬�̳�Person�࣬����sno��score���ԣ�
�Լ��вι��������������е��ø���Ĺ�������
*/

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;//�����֡�
		this.age = age;//�������
	}
	
	public void saySomething() {
		System.out.println("����־��  " + "��" + name + "Ҫfuck" + age + "������\n"
				         + "                �����ͯ��ͯŮ��Ȼ��Ե�");
	}
}

class Student extends Person{
	int sno;//��ѧ�š�
	int score;//��������
	
	public Student(String name, int age, int sno, int score) {
		super(name, age);
		this.sno = sno;
		this.score = score;
	}
}

public class day1208 {
	public static void main(String[] args) {
		Student zjm = new Student("�ż���", 23, 19960122, 59);
		System.out.println("�����֡�  " + zjm.name);
		System.out.println("�������  " + zjm.age);
		System.out.println("��ѧ�š�  " + zjm.sno);
		System.out.println("��������  " + zjm.score);
		zjm.saySomething();
	}
}
