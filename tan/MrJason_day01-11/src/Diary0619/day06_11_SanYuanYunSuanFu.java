package Diary0619;

public class day06_11_SanYuanYunSuanFu {
	public static void main(String[] args) {
		//���ʽΪtrueȡ:֮ǰ�ģ�Ϊfalseȡ֮���
		int age = 18;
		System.out.println(age >= 18 ? "������-�����ϵܣ�" : "δ����");
		
		age = 17;
		System.out.println(age >= 18 ? "������" : "δ����-�L��ȥ��");
		
		String fucker = age >= 18 ? "������" : "δ����-�����裡�����㣿";
		System.out.println(fucker);
		
		System.out.println("*********************");
		
		int a = 1000;
		System.out.println(1000 / 60);//��16��
		System.out.println(1000 % 60);//��40��
		
		
		
		
		
		
		
		
		
		System.out.println("*********************");
		
		System.out.println("����˭���������");
		int x = 1000;
		String minute = "����";
		String hour = "Сʱ";
		
		System.out.println(1000 / 60 + hour + (1000 % 60) + minute );
		System.out.println(1000 / 60 + hour + " " + (1000 % 60) + minute );
		System.out.println(1000 / 60 + "С�r" + (1000 % 60) + "���" );
		System.out.println("*******");
		
		System.out.println(x / 60 + hour + " " + x % 60 + minute);
		
		String time = x / 60 + hour + " " + x % 60 + minute;
		
		System.out.println(minute);
		System.out.println(hour);
		System.out.println(time);//��16Сʱ 40���ӡ���ʱ���͡�4�����м���һ���ո�
		
		System.out.println("*********************");
		
		
		
		
		int r = 5;// radius �뾶��5
		double �� = 3.141592653;
		String m = "��";
		System.out.println(2 * �� * r + m);
		String p = 2 * �� * r + m;
		System.out.println(p);
//		String p = 2 * �� * r;//�������  ��������Spring���ɱ��룬�������ӡ�+ m��   ���ﲻ��
		
		String square = "ƽ����";
		System.out.println(�� * r * r + square);
		//String MianJi = �� * r * r + square;
		System.out.println("*********************");
		
		
		
		
		int msf = 28;//msf �� ���ٷ�
		int zjm = 23;//zjm �� �ż���
		System.out.println(msf > zjm ? "���ٷ� �� �ż��� �����" : "��ƨ���ż��������");
		String father = msf > zjm ? "���ٷ� �� �ż��� �����" : "��ƨ���ż��������";
		System.out.println(father);
		
		zjm = 32;
		System.out.println(msf > zjm ? "���ٷ� �� �ż��� �����" : "��ƨ���ż��������");
		String mother = msf > zjm ? "���ٷ� �� �ż��� �����" : "��ƨ���ż��������";
		System.out.println(mother);
		
		String A = ""+5;//��A�������֡�
		System.out.println(A);
//		System.out.println(A == 5 ? "�ǵ�" : "����");// ������󣬡�A�������֡�
		int i = 5;
		
		
		
		
	}
}
