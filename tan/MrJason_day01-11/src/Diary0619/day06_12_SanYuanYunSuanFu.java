package Diary0619;

public class day06_12_SanYuanYunSuanFu {
	public static void main(String[] args) {
		//������1000�����Ƕ���Сʱ������ʱ�䣿������
		int Duration = 1000;
		int hour = Duration / 60;
		int minute = Duration % 60;
		String h = "Сʱ";
		String m = "����";
		System.out.println(hour);//��16��
		System.out.println(minute);//��40��
		String time = hour + h + " " + minute + m;
		System.out.println(time);//��16Сʱ 40���ӡ�
		
		double SJ = hour + minute / 60;
		System.out.println(SJ);//��16.0��
		
		
		
		System.out.println("*********************");
		//����������뾶��5��Բ���ܳ������������
		int r = 5;
		final double �� = 3.141592653;
		double z = 2 * �� * r;
		double s = �� * r * r;
		System.out.println(z);//��31.41592653��
		System.out.println(s);//��78.539816325��
		//�������룬�õ�һ����ӽ���longֵ
//		System.out.println(Math.round(z));//31
//		System.out.println(Math.round(31.4));//31
//		System.out.println(Math.round(31.5));//32
		
		System.out.println((double)Math.round(z * 10));//��314.0��
		System.out.println((double)Math.round(z * 10) / 10);//��31.4��
		
		System.out.println((double)Math.round(z * 100));//��3142.0��
		System.out.println((double)Math.round(z * 100) / 100);//��31.42��
		
		final double PI = Math.PI;//3.141592653589793
		
		System.out.println((double)Math.round(s * 100) / 100);//��78.54��
		
		
		
		
		
		
		
		
		System.out.println("*********************");
		//
		int a = 3;
		int b = 4;
		int c = 5;
		int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(result);//��5��
		
//		String WhoBig = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
		String WhoBig = a > b ? (a > c ? "�ݣ�������A" : "C��JB���") : (b > c ? "BB���ү��" : "C��JB��");
		System.out.println(WhoBig);
		 
		
		
		int msf = 28;//msf �� ���ٷ�
		int zjm = 23;//zjm �� �ż���
		String father = msf > zjm ? "���ٷɴ�" : "�ż�����";
		System.out.println(father);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
