package Diary0627;

//����һ����Person
//Person��һ�ָ��ӵ���������
//���൱�ڴ�����һ��ģ��
public class Person {
	String name;
	int age;
	char gender;
	int sno;
	
	//static�������෽��������ķ�����ʵ������
	//static������ͨ���������õģ�ʵ��������ͨ��������õ�
	//��ȡname����
	//���ĸ������ϵ���getName�������ͷ����Ǹ������name����
	public String getName() {
		//�����nameָ���ǵ��ô˷����Ķ����name
		return name;
	}
	
	//�޸�name����ΪnewName
	//���ĸ������ϵ���setName���������޸��ĸ������name����
	public void setName(String newName) {
		//�����nameָ���ǵ��ô˷����Ķ����name
		name = newName;
	}
	
	public void showInfo() {
		System.out.println("�ҵ������ǣ�" + name);
		System.out.println("�ҵ��Ա��ǣ�" + gender);
		System.out.println("�ҵ������ǣ�" + age);
		
	}
}
