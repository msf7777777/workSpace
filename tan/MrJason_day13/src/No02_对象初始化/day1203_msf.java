package No02_�����ʼ��;
class Fuck {
	private String name = setDefaultName();// ����������ʱ��ֵ
	private int age = 0;// ����������ʱ��ֵ
	// �����
	// ��¼��������ĸ���
	public static int COUNT;
	// ��̬�����
	// ��̬��������౻����ʱִ��
	// ÿ����ֻ������һ�Σ���˾�̬�����ִֻ��һ��
	// ��̬�����������ʼ����̬�ֶ�(�����)
	// ���ܷ���ʵ���ֶ�
	static {
	COUNT = 0;
	System.out.println("----------��1��----------");
	System.out.println("��̬�����ִ�� " + "COUNT = " + COUNT);
	}
	// �Ǿ�̬�����
	// �Ǿ�̬�������ÿ�δ��������ʱ��ִ��
	// �Ǿ�̬�����������ʼ��ʵ���ֶ�
	
	{
	System.out.println("----------��3��----------");
	System.out.println("�Ǿ�̬�����ִ��");
	COUNT++;
	}
	
	public Fuck() {
	System.out.println("----------��4��----------");
	System.out.println("Ĭ�Ϲ�����ִ��");
	}
	
	private String setDefaultName() {
	System.out.println("----------��2��----------");
	System.out.println("setDefaultName()");
	return "defaultName";
	}
	
	public Fuck(String name, int age) {
	this.name = name;
	this.age = age;
	}
	public String getName() {
	return name;
	}
	public int getAge() {
	return age;
	}
}
public class day1203_msf {
	public static void main(String[] args) {
		//1�������ִ࣬�о�̬����飨ֻ����һ�Σ�
		//2��ִ�г�Ա�����ĸ�ֵ���
		//3��ִ�зǾ�̬�����
		//4�����ù����� or dont��û�и�ֵ������µ��ù�����Ĭ��ֵ��
		//5��ִ��main������������
		
		//ctrl + f���Һ��滻
		Fuck Fuck1 = new Fuck();
		System.out.println("----------��5��----------");
		System.out.println(Fuck1.getName());
		System.out.println("----------��6��----------");
		System.out.println(Fuck1.getAge());
		System.out.println("----------��7��----------");
		System.out.println("COUNT = " + Bar.COUNT );//��COUNT = 1��
		System.out.println();
		System.out.println();
		
		Fuck Fuck2 = new Fuck("�ٳ�",28);
		System.out.println("----------��8��----------");
		System.out.println(Fuck2.getName());
		System.out.println("----------��9��----------");
		System.out.println(Fuck2.getAge());
		System.out.println("----------��0��----------");
		System.out.println("COUNT = " + Bar.COUNT );//��COUNT = 2��
		System.out.println();
		System.out.println();
		
		Fuck Fuck3 = new Fuck("��ϫ",23);
		System.out.println("----------��J��----------");
		System.out.println(Fuck3.getName());
		System.out.println("----------��Q��----------");
		System.out.println(Fuck3.getAge());
		System.out.println("----------��K��----------");
		System.out.println("COUNT = " + Bar.COUNT );//��COUNT = 3��
		System.out.println();
		System.out.println();
		
	}
}
