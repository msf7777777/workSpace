package Diary0623;

public class day09_04_ZuoYongYu_02_01 {
	//���������������ȫ�ֱ�����ֻҪ�ܷ��ʵ�����������ֱ��ʹ����
	//�����ڱ�������з�����ʹ��
	//Ҳ������������ķ�����ʹ�ã�ǰ������������ʹ����public���η�
	//���ʹ��private���η���ֻ���ڱ����з���
	public static int count = 7777777;
	private static int fuck = 4444;
	
	public static void f1(){
		int n = 2;
		if(n >= 2){
			//a����if���������ģ������������Ǵ������ĵط���ʼ��һֱ�������
			int a = 5;
			System.out.println(a);
		}
		System.out.println(n);
		System.out.println(count);
		System.out.println(fuck);
	}
	public static void f2(){
//		System.out.println(n);//������󣬡�n������f1������������
//		System.out.println(a);//�������һ�����ʲ���
		System.out.println(count);
		System.out.println(fuck);
	}
	//����n��f3�Ÿ�������ʱ������f3����ִ����Ϻ�����
	//����n��������������������
	public static void f3(){
		System.out.println(count);
		System.out.println(fuck);
				
	}
	public static void main(String[] args) {
		System.out.println(count);
		System.out.println(fuck);
	}
}
