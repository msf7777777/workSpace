package Diary0620;

public class day07_07_switch_ {
	public static void main(String[] args) {
		//switch�����ڼ���ѡ��������ѡ��
		int number = 6;
		if(number == 1){
			System.out.println("һ");
		}else if(number == 2){
			System.out.println("��");
		}else if(number == 3){
			System.out.println("��");
		}else if(number == 4){
			System.out.println("��");
		}else if(number == 5){
			System.out.println("��");
		}else{
			System.out.println("number ����12345");
		}
		System.out.println("**********");
		
		//switch���ڼ���ѡ��������ѡ��
		number = 3;
		switch(number){
		case 1 ://���number�ǡ�1������ִ������Ĵ��룬break����ֹ������case��default��������
			System.out.println("һ");
			break;
		case 2 :
			System.out.println("��");
			break;
		case 3 :
			if(number > 3)
			System.out.println("��");
			if(number > 1){
				System.out.println("2 > 1");
			}
			break;
		case 4 :
			System.out.println("��");
			break;
		case 5 :
			System.out.println("��");
			break;
		default ://��������case��û��ƥ��ɹ�����ô�ͻ�default��õ�ִ��
			System.out.println("number ����12345");
			break;	
		}
		System.out.println("**********");
		
		int x = 7;
		switch(x){
		case 7 :
			System.out.println("��ã�");
			System.out.println("�������ٷ�");
			System.out.println("��֪�������ٻ�����");
			break;
		}
		//switch���ֻ��ʹ��char��byte��short��int��String��ö��
		//case�����Ǳ���ʱ��һ������
		
		
	}
}
