
public class Child {
	private String name;
	private int age;
	
//	����get��set�����Ĳ���
//	1> alt + shift + s
//	2> ѡ��Generate Getters and Setters....�� 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//ʹ�����ݷ�װ���������䷶Χ
	public void setAge(int age) {
		if(age <= 0 || age >= 150) {
			System.out.println("�Ƿ�����");
			return;
		}
		this.age = age;
	}
	
	
}
