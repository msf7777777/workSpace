package Diary0627;

public class day0717_03_DuiXiangDeFangFa_02 {
	public static void main(String[] args) {
		Person per = new Person();
		per.name = "����";
		//���ö���p��getName����������ȡ����p��name���ԣ���������Ϊ����ֵ��ֵ��name����
		String name = per.getName();
		System.out.println(name);//��������
		
		Person p1 = new Person();
		p1.name = "����";
		//���ö���p1��getName����������ȡ����p1��name���ԣ���������Ϊ����ֵ��ֵ��name����
		String name1 = p1.getName();
		System.out.println(name1);//�����ġ�
		
		//���ö���p��setName��������������1��
		per.setName("������");
		//���ö���p1��setName��������������1����Ϊ�������ݹ�ȥ
		p1.setName("������");
		
		System.out.println(per.getName());//����������
		System.out.println(p1.getName());//�������ġ�
		
		System.out.println(per.name);//����������
		System.out.println(p1.name);//�������ġ�
		
	}
}
