package Diary0623;

public class day09_01_print_01 {
	//publicָʾ��������ǹ��еģ��������������е���
	//staticָʾ��������Ǿ�̬�ģ����Բ���������ͨ����������
	//voidָʾ���������û�з���ֵ
	//����Ƿ�����������������main�ڷ���֮ǰ
	//�����������ǡ�print��
	//ÿ���������ṩһ������
	//��������Ĺ����Ǵ�ӡһ��5�е�ֱ��������
	public static void print(){
		for(int x = 1;x <= 7;x++){
			for(int y =1;y <= x;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//���á�day0623_01_print����print����
		//������������ʱ��ִ�з����еĴ���
		//��print�����еĴ����ִ�н����󣬲Ż����ִ��main�����к����Ĵ���
		//����print������main������ͬһ�����У���˿��Ժ��Ե�����ֱ�ӵ���
		//print();
		
		print();
		System.out.println("��������������������һ��������������������");
		day09_01_print_01.print();
		System.out.println("�������������������ڶ���������������������");
		day09_01_print_01.print();
		System.out.println("������������������������������������������");
		for(int x = 1;x <= 3;x++){
			day09_01_print_01.print();
		}	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	