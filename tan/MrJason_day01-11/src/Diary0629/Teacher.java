package Diary0629;

public class Teacher {
	String name;
	int age;
	
	public Teacher(String name,int age) {
		//���ù�����ʱ����û�б���������
		//�ڹ�������this����ǰ�������Ķ���
		this.name = name;
		this.age = age;
		System.out.println(this);
	}
	
	public void setName(String newName) {
		//�����ô˷����Ķ����name���Ը�ֵ
//		name = newName;
		//��ʵ�������У�this������ô˷����Ķ���
		this.name = newName;
		
		System.out.println(this);
	}
	
	public void setAge(int age) {
//		age = age;//�޷��������age���Ը�ֵ
		this.age = age; 
		
		
	}
}
