package Diary0629;

public class day0718_03_this_01_Teacher {
	//ûһ��ʵ�������͹���������һ����ʽ����this
	//��ʵ�������У�this������ô˷����Ķ���
	//�ڹ�������this����ǰ�������Ķ���
	public static void main(String[] args) {
		Teacher t1 = new Teacher("���ٷ�",28);
		System.out.println(t1);
		t1.setName("�ż���");
		System.out.println(t1.name);//���ż�����
		t1.setAge(23);
		System.out.println(t1.age);//��23��
		
		System.out.println(t1);
	}
}
 