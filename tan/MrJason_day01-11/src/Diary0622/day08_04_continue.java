package Diary0622;

public class day08_04_continue {
	public static void main(String[] args) {
		//continue�������������������䣬����ʼִ����һ������
		//continue���ĸ�ѭ�����У��ͻ�����������������
		//continue��break��������while��do while��ʹ��
		//��breakһ����continue���ĸ�ѭ���оͶ��Ǹ�ѭ��������
		//continueֻ���ڲ�ѭ����������
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//��0123456789��
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			if(x == 5){
				continue;
			}
			System.out.print(x);//��01234678910��
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//��012345��
			if(x >= 5){
				break;
			}
			
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			if(x >= 3 && x <= 6){
				continue;
			}
			System.out.print(x);//��01278910��
		}
		System.out.println();
		System.out.println("***************");
		
		int x = 0;
		while(x < 10){
			x++;
			if(x == 5){
				continue;
			}
			System.out.println("����" + " " + x);
		}
		System.out.println("��hi��");
		System.out.println("***************");
		
		int z = 0;
		while(z < 10){
			
			System.out.println("����" + " " + z);
			if(z == 10){
				continue;
			}
			z++;
		}
		System.out.println();
		System.out.println("***************");
		System.out.println("***************");
		//��breakһ����continue���ĸ�ѭ���оͶ��Ǹ�ѭ��������
		//continueֻ���ڲ�ѭ����������
		
		
		
		
		
		
		
		
		
	}
}
