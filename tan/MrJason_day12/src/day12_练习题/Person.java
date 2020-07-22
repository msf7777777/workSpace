package day12_��ϰ��;

public class Person {
	private String name;
	private int age;
	private int sno;
	
	public Person(String name, int age, int sno) {
		this.name = name;
		this.sno = sno;
		if(age < 0 || age > 130) {
			System.out.println("�Ƿ���������");
			return;
		}
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
		if(age < 0 || age > 130) {
			System.out.println("�Ƿ���������");
			return;
		}
		this.age = age;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	
}
