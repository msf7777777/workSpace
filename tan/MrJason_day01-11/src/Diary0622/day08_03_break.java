package Diary0622;

public class day08_03_break {
	public static void main(String[] args) {
		//break������ʹѭ����ֹ
		//break���ĸ�ѭ�����У��ͻᵼ���ĸ�ѭ����ֹ
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//��0123456789��
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x <= 10;x++){
			System.out.print(x);//��012345��
			if(x == 5){
				break;
			}
		}
		System.out.println();
		System.out.println("***************");
		
		for(int x = 0;x < 10;x++){
			System.out.print(x);//����
		}
		System.out.println();
		System.out.println("***************");
		
		for(int a = 1;a <= 5;a++){//����
			for(int b = 1;b <= 4;b++){//���¡�
				for(int c = 1;c <= 3;c++){//���ڡ�
					System.out.println("��" + a + "��" + "��" + b + "��" + "��" + c + "��");
					if(c == 2){
						break;
					}
				}
				if(b == 3){
					break;
				}
				
			}
			if(a == 4){
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
