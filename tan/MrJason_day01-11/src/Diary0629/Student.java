package Diary0629;

public class Student {
//	Ĭ�ϵ��޲ι�������������Ĺ�����
//	public Student() {
//		
//	}
	
	String name;
	int age;
	
	//����ṩ��һ������������ô�������Ͳ����ṩĬ�ϵ��޲ι�������
	//�����������Ʊ�������������ͬ
	//������û�з���ֵ�����Ҳ�ʵ��void
	public Student() {
		System.out.println("Student������");
	}
	
	//��������������
	//�����������в���
	//���������ڳ�ʼ������
	public Student(String newName,int newAge) {
		name = newName;
		age = newAge;
		
	}
	
	public void showInfo() {
		System.out.println("�ҵ����ֽ� " + name);
		System.out.println("�ҽ��� " + age + "����");
	}
	
}
