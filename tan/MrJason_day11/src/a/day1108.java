package a;

public class day1108 {
	//�����ʹ�á�public���ؼ��֣�ָ������ǹ��еģ����Ա������޹�����ʣ�����ͬһ�����µ���Ͳ�ͬ���µ��ࣩ
	//����������η�������Ϊ�������Ĭ�Ϸ���Ȩ�ޣ�������Ȩ�ޣ������Ա�ͬһ�����µ��޹�����ʡ�
	public static void main(String[] args) {
		A a = new A();
		
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		A4 a4 = new A4();
		
		System.out.println(a1.age);//private
		System.out.println(a2.age);//public
		System.out.println(a3.age);//�����η�(default)
		System.out.println(a4.age);//protected
	}	
}
