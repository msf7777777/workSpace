package Diary0623;

public class day09_03_ChongZai_01 {
	//һ���������Ժ���һ����������ͬ�ķ��������������в�ͬ�ķ���������������������������ء�
	//�������صĺô�������Ϊһ�鷽����ͬ��ͬ�����֣����ӿɶ���
	
	//ͬһ���У��������ظ��ķ���ǩ���ġ�
	
	//������һ�������б�Ϊ�յķ���
	//����ǩ�������·����ķ���ǩ���ǡ�f()��
	//����ǩ�����Ƿ�������+�����б�
	public static void f(){
		System.out.println("f()");
	}
	//������һ�������б�Ϊint�ķ���
	//����ǩ�������·����ķ���ǩ���ǡ�f(int)��
	//����ǩ�����Ƿ�������+�����б�
	//�����������ڲ����б�
	public static void f(int number){
		System.out.println("f(int number)");
	}
	public static void f(long number){
		System.out.println("f(long number)");
	}
	//��������б�Ϊint
	//������󣬲����������ڲ����б���˷����ظ�����
//	public static void f(int n){
//		System.out.println();
//	}
	
	//������������ǩ����ͬ����һ���ǡ�f(int,String)�����ڶ����ǡ�f(String,int)��
	//����ǩ�� f(int,String)
	public static void f(int number,String str){
		
	}
	//����ǩ�� f(String,int)
	public static void f(String str,int number){
		
	}
	
//**********************************************//	
	public static void main(String[] args) {
		//���ò����б�Ϊ�յĲ�������
		f();
		//���ò����б�Ϊint��f����
		f(1);
		//���ò����б�Ϊlong��f����
		f(2L);
		System.out.println("f()");
		System.out.println("f(1)");
		System.out.println("f(2L)");
	}
}
