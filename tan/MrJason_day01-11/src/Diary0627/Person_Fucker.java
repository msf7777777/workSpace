package Diary0627;

public class Person_Fucker {
	public static void main(String[] args) {
		//����һ�����ͣ����Դ��������ܶ����
		//ʹ��new������������һ��Person��Ķ���p
		//��˶���p���ĸ�����name,age,gender,sno
		Person p = new Person();
		//Ϊ����p�ĸ������Ը�ֵ
		p.name = "����";
		p.age = 10;
		p.gender = '��';
		p.sno = 20191101;
		
		//�������p�ĸ�������
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.sno);
		
		//������p��age��ֵ������age
		int age = p.age;
		System.out.println(age);
		
	}
}
