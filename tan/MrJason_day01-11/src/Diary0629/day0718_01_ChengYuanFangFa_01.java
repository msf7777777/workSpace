package Diary0629;

public class day0718_01_ChengYuanFangFa_01 {
	public static void main(String[] args) {
		//��ʱ��new�������������һ��ʵ��ʱ���������ᱻ���á�
		//û�й��������ܴ����������û�й����������������ṩһ��Ĭ�ϵ��޲ι�����
		Person p1 = new Person();
		p1.name = "����";
		p1.gender = '��';
		p1.age = 20;
		
		Person.setCount(1);//ͨ�����������෽��
		
		p1.showInfo();//ͨ���������ʵ������
		
		System.out.println("**********��1��**********");
		
		Person p2 = new Person();
		p2.name = "����";
		p2.gender = 'Ů';
		p2.age = 21;
		
		Person.setCount(Person.getCount() + 1);//ͨ�����������෽��
		
		p2.showInfo();//ͨ���������ʵ������
		
		System.out.println("��" + Person.getCount() + "������");
		
		
		
	}
}
