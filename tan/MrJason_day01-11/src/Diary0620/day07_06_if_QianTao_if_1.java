package Diary0620;

public class day07_06_if_QianTao_if_1 {
	public static void main(String[] args) {
		//Ƕ�׵�if
		int a = 1001;//���Գɼ�
		if(a >= 60 & a <= 100){
			//ͨ����
			if(a >= 90){
				System.out.println("����");
			}else if(a >= 80){//a < 90 && a >= 80
				System.out.println("����");
			}else{//a < 80 && a >= 60
				System.out.println("�ɼ�һ��");
			}
		}else if(a < 60 & a >= 0){
			System.out.println("�ҿ�");
		}else if(a < 0){
			System.out.println("ɵ�ư���");
		}else if(a > 100 & a <= 1000){
			System.out.println("�㻹��������");
		}else{
			System.out.println("��Խ������");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
