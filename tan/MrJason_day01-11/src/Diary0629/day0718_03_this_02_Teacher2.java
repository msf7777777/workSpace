package Diary0629;

public class day0718_03_this_02_Teacher2 {
	//ûһ��ʵ�������͹���������һ����ʽ����this
	//��ʵ�������У�this������ô˷����Ķ���
	//�ڹ�������this����ǰ�������Ķ���
	public static void main(String[] args) {
		Teacher2 t1 = new Teacher2();
		t1.set("�ż���",23);
		System.out.println(t1.name + t1.age + "����");//���ż���0���꡿
		
		System.out.println(t1);
	}
}
