package Diary0619;

public class day06_05_I_am_28_years_old {
	public static void main(String[] args) {
		int num = 28;
		String a = "��";
		String b = "����";
		System.out.println(a + num + b);//����28���꡿
		System.out.println(a + num + 1 + b);//����281���꡿
		System.out.println(a + (num) + b);//����28���꡿
		System.out.println(a + (num + 1) + b);//����29���꡿
		System.out.println(num + 1 + a + 1 + b);//��29��1���꡿         ������⣺��281��1���꡿
		System.out.println(num + (1 + a) + 1 + a + 1 + b);
		//�������
		
		int x = 2;
		int y = 3;
		System.out.println(a + x * y + (num) + b);//����628���꡿
		System.out.println(a + x * (y + num) + b);//����62���꡿
		System.out.println(a + x + (y + num) + b);//����231���꡿
		System.out.println(a + (x + (y + num)) + b);//����33���꡿
		
		System.out.println("*********************");
		
		String age = a + (x + (y + num)) + b;
		System.out.println(age);
		
		System.out.println("*********************");
		
		int z = 2019;
		String minute = "����";
		String hour = "Сʱ";
		
		System.out.println(1000 / 60 + hour + (1000 % 60) + minute );
		System.out.println(1000 / 60 + hour + " " + (1000 % 60) + minute );
		
		System.out.println(z / 60 + hour + " " + z % 60 + minute);
		
		String time = z / 60 + hour + " " + z % 60 + minute;
		System.out.println(time);
		
		
		
		
	}
}
