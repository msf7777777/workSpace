package Diary0629;

public class day0718_02_GouZaoQi_01_01 {
	public static void main(String[] args) {
		//��ʹ��new�������������һ��ʵ��ʱ�򣬹������ͻᱻ���á�
		//û�й��������ܴ����������û�й����������������ṩһ��Ĭ�ϵ��޲ι�����
		Student p1 = new Student();
		Student p2 = new Student();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("----------��1��----------");
		
		//�����вι�����
		Student p3 = new Student("�ż���",23);
		Student p4 = new Student("���ٷ�",28);
		
		System.out.println(p3.name);
		System.out.println(p4.age + "(" + p4.name + ")");
		
		System.out.println("----------��2��----------");
		
		p3.showInfo();
		System.out.println("----------��3��----------");
		p4.showInfo();
		
		System.out.println("---------��end��---------");
	}
}
