package Diary0622;

public class day08_06_Za {
	public static void main(String[] args) {
		//���ַ�ת�����������洢
		char c = 'a';
		System.out.println(c);//a
		System.out.println((int)c);//97
		System.out.println("*********************");
		
		int x = 0,y = 2;
		while(x <= 100 && x + y <= 100 + 2){
			//System.out.println(x);
			x = x + y;
		}
		
		while(x % 2 ==0 && x <= 100){
			System.out.println(x);
			x++;
		}
		System.out.println("����ûִ��");
		System.out.println("*********************");
		
		int z = 0; 
		do{
			System.out.println(z);
			z++;
		}while(z % 2 == 0 && z <= 100);
		System.out.println("�������ִֻ����һ��");
		System.out.println("*********************");
		
		for(x = 0;x <= 100;x++){
			if(x % 2 == 0){
				System.out.println(x);
			}
		}
		System.out.println("���������0-100��ż�����Ǿ͹�ϲ�㣡");
		System.out.println("**************************");
	}
}
