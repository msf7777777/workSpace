package Diary0629;

public class Teacher2 {
	String name;
	int age;
	public void set(String newName,int age) {
		//�����ô˷����Ķ����name���Ը�ֵ
		name = newName;
		//��ʵ�������У�this������ô˷����Ķ���
		//�����ô˷����Ķ����age���Ը�ֵ
		age = age;
		
		System.out.println(this);
	}
}
