
package Diary0629;

public class Person {
	String name;//ʵ������
	char gender;//ʵ������
	int age;//ʵ������
	static int count;//�����
	
	//ʵ������
	//ʵ���������Բ������ô˷����Ķ����ʵ������
	//
	public void showInfo() {
		System.out.println("�ҽУ�" + name);
		System.out.println("�ҵ��Ա��ǣ�" + gender);
		System.out.println("�ҽ��꣺" + age + "����");
		
		//ʵ���������Է��������
		System.out.println("��" + count + "������");
	}
	
	//�෽��
	//�෽�����ڲ��������
	public static void setCount(int newCount) {
		count = newCount;
		
		//�෽�����ܷ���ʵ������
//		System.out.println(name);//�������
	}
	
	//�෽��
	//�෽�����ڲ��������
	public static int getCount() {
		return count;
	}
	
}
