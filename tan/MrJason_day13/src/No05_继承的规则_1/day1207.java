package No05_�̳еĹ���_1;

//��̬��Ա����̬��������̬��������̬�����������Ǽ̳����⣬��̬��Ա���ܱ��̳С�
//���಻�ܼ̳и����private��Ա�����Ժͷ�������
//protected��Ա����������Ȩ�ޣ�protected��Ա���Ա�ͬһ�����µ���������ʡ�
//protected��Ա���Ա�������ʣ������������͸����Ƿ���ͬһ�����¡�
//������Լ̳ж����ɼ��ĳ�Ա��
//������Լ̳и����public��protected��Ա��
//�������͸�����ͬһ�����£����໹���Լ̳и����default��Ա��
//������������ĳ�Ա������޷����̳У������������ʹ��super�ؼ��ֵ����䳬��Ĺ�������
//������������ͳ���ͬ�����ֶΣ��⽫���������䳬����ֶΡ�

class Person{
	private String name;
	protected int age;
	int fuck;
	
	public void showInfo() {
		System.out.println(fuck);
	}

	public Person(String name, int age, int fuck) {
		super();
		this.name = name;
		this.age = age;
		this.fuck = fuck;
	}
}

class Student extends Person{
	private int sno;
	int fuck;
	
	public Student(String name, int age, int fuck1, int sno, int fuck2) {
		super(name, age, fuck1);
		this.sno = sno;
		fuck = fuck2;
	}

	public void showInfo() {
//		System.out.println("�ҵ�����" + name);
		System.out.println("�ҵ�����" + age);
		System.out.println("�ҵ�ѧ��" + sno);
		//���ཫ���س����ͬ���ֶ�
		System.out.println("���ǣ�" + fuck);//���ʵ��������fuck
		System.out.println("��������fuck��" + super.fuck);
		System.out.println("��������fuck��" + this.fuck);
	}
}

public class day1207 {
	public static void main(String[] args) {
		Student s = new Student("�ż���", 23, 666, 19960122, 777);
//		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.fuck);
//		System.out.println(s.sno);
		s.showInfo();
		
		System.out.println("----------����----------");
		
		Person p = new Person("���ٷ�", 28, 5427187);
		p.showInfo();
		
	}
}
