package Diary0620;

public class day07_09_LianXi_01 {
	public static void main(String[] args) {
		//java.util.Scanner��һ���࣬����һ��ɨ����
		//System.in�����׼�����������Ǵӿ���̨����ȡ����
		//new��һ������������������һ��ɨ��������
		//s�����˸մ�����ɨ����
		java.util.Scanner s = new java.util.Scanner(System.in);
		int score = s.nextInt();//��ȴ���������һ��int���ݣ�����������ֵ��score
		if(score <=100 && score >= 0){
			if(score >= 60){
				System.out.println("����");
			}else{
				System.out.println("������");
			}
		}
//		s.close();//�ر�ɨ����
//		System.out.println("**********");
		
		int c = s.nextInt();
		System.out.println(c);
		s.close();
		
		String msf = "�������ٷ�";
		System.out.println(msf);
		s.close();
		
		
		
	}
}
