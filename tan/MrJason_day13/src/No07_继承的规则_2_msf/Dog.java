package No07_�̳еĹ���_2_msf;

public class Dog extends Animal {
	private int age;

	public Dog(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void say() {
		System.out.println("�ҽ�" + getName() + "�ҽ���" + age + "����");
	}
}
