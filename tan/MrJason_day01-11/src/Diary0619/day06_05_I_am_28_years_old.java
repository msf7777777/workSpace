package Diary0619;

public class day06_05_I_am_28_years_old {
	public static void main(String[] args) {
		int num = 28;
		String a = "我";
		String b = "周岁";
		System.out.println(a + num + b);//【我28周岁】
		System.out.println(a + num + 1 + b);//【我281周岁】
		System.out.println(a + (num) + b);//【我28周岁】
		System.out.println(a + (num + 1) + b);//【我29周岁】
		System.out.println(num + 1 + a + 1 + b);//【29我1周岁】         错误理解：【281我1周岁】
		System.out.println(num + (1 + a) + 1 + a + 1 + b);
		//慢慢玩儿
		
		int x = 2;
		int y = 3;
		System.out.println(a + x * y + (num) + b);//【我628周岁】
		System.out.println(a + x * (y + num) + b);//【我62周岁】
		System.out.println(a + x + (y + num) + b);//【我231周岁】
		System.out.println(a + (x + (y + num)) + b);//【我33周岁】
		
		System.out.println("*********************");
		
		String age = a + (x + (y + num)) + b;
		System.out.println(age);
		
		System.out.println("*********************");
		
		int z = 2019;
		String minute = "分钟";
		String hour = "小时";
		
		System.out.println(1000 / 60 + hour + (1000 % 60) + minute );
		System.out.println(1000 / 60 + hour + " " + (1000 % 60) + minute );
		
		System.out.println(z / 60 + hour + " " + z % 60 + minute);
		
		String time = z / 60 + hour + " " + z % 60 + minute;
		System.out.println(time);
		
		
		
		
	}
}
