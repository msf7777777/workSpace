package Diary0627;

public class day0717_03_DuiXiangDeFangFa_01 {
	public static void f() {
		
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "����";
		//���ö���p��getName����������ȡ����p��name���ԣ���������Ϊ����ֵ��ֵ��name����
		String name = p.getName();
		System.out.println(name);//��������
		
		Person p1 = new Person();
		p1.name = "����";
		//���ö���p1��getName����������ȡ����p1��name���ԣ���������Ϊ����ֵ��ֵ��name����
		String name1 = p1.getName();
		System.out.println(name1);//�����ġ�
		
		//���ö���p��setName��������������1��
		p.setName("������");
		//���ö���p1��setName��������������1����Ϊ�������ݹ�ȥ
		p1.setName("������");
		
		System.out.println(p.getName());//����������
		System.out.println(p1.getName());//�������ġ�
		
		System.out.println(p.name);//����������
		System.out.println(p1.name);//�������ġ�
		
		//ʵ���������Բ������ô˷����Ķ��������
		p.showInfo();
		p1.showInfo();
		
		day0717_03_DuiXiangDeFangFa_01 d = new day0717_03_DuiXiangDeFangFa_01();
//		Math math = new Math();//Mathû�й�����������ʵ����
		
	}
}