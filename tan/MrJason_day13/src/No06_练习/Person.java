package No06_��ϰ;
/*
��дһ��Person�࣬�������ԣ�name��age����
�вι�����������say(�������ҽ��ܵ��ַ������� 
��дһ��Student�࣬�̳�Person�࣬����sno��score���ԣ�
�Լ��вι��������������е��ø���Ĺ�������
*/
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String say() {
		return "�ҽУ�" + name + "\n"
	         + "�ҵ����䣺" + age + "����" + "\n";
	}
	
	public String fuck() {
		return "��" + name + "������" + "\n"
			 + "��" + name + "��ʵ" + (age + 50) + "����" + "\n";
	}
	
	public String nameZjm() {
		return name;
	}
}
