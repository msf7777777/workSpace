package Diary0620;

public class day07_01_if {
	public static void main(String[] args) {
		if(true){
			System.out.println("���ٷ�ϲ���ż���");//�����ٷ�ϲ���ż�����
		}
		int a = 1;
		int b = 2;
		if(a > b){
			System.out.println("���ٷɲ����ż���");//��if��������
		}
		
		
		if(a < b){
			System.out.println("���ٷɰ��ż���");//�����ٷɰ��ż�����
		}
		System.out.println("*********************");
		
		if(false){
			System.out.println("�ż�����ɵ��");
		}
		System.out.println("*********************");
		
		int x = 5;
		if(x == 5){
			System.out.println("x == 5");
		}
		
		x = 6;
		if(x == 5){
			System.out.println("x == 6");
		}
		
		int y = 6;
		System.out.println("*********************");
		
		int i = 0;
		int j = i+++i+++i+i+++i+i;//��0+1+2+2+3+3��
		System.out.println(j);//��11��
		
		
		
		
		
		
		
		System.out.println("*********************");
		
		int msf = 28;
		int zjm = 23;
		String father = msf > zjm ? "������ְ�" : "�ż����ܺ���";
		System.out.println(father);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
