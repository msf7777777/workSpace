package Diary0619;

public class day06_12_SanYuanYunSuanFu {
	public static void main(String[] args) {
		//〓〓〓1000分钟是多少小时，多少时间？〓〓〓
		int Duration = 1000;
		int hour = Duration / 60;
		int minute = Duration % 60;
		String h = "小时";
		String m = "分钟";
		System.out.println(hour);//【16】
		System.out.println(minute);//【40】
		String time = hour + h + " " + minute + m;
		System.out.println(time);//【16小时 40分钟】
		
		double SJ = hour + minute / 60;
		System.out.println(SJ);//【16.0】
		
		
		
		System.out.println("*********************");
		//〓〓〓计算半径是5的圆的周长和面积〓〓〓
		int r = 5;
		final double π = 3.141592653;
		double z = 2 * π * r;
		double s = π * r * r;
		System.out.println(z);//【31.41592653】
		System.out.println(s);//【78.539816325】
		//四舍五入，得到一个最接近的long值
//		System.out.println(Math.round(z));//31
//		System.out.println(Math.round(31.4));//31
//		System.out.println(Math.round(31.5));//32
		
		System.out.println((double)Math.round(z * 10));//【314.0】
		System.out.println((double)Math.round(z * 10) / 10);//【31.4】
		
		System.out.println((double)Math.round(z * 100));//【3142.0】
		System.out.println((double)Math.round(z * 100) / 100);//【31.42】
		
		final double PI = Math.PI;//3.141592653589793
		
		System.out.println((double)Math.round(s * 100) / 100);//【78.54】
		
		
		
		
		
		
		
		
		System.out.println("*********************");
		//
		int a = 3;
		int b = 4;
		int c = 5;
		int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(result);//【5】
		
//		String WhoBig = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
		String WhoBig = a > b ? (a > c ? "草！是老子A" : "C的JB最大") : (b > c ? "BB你大爷啊" : "C最JB大");
		System.out.println(WhoBig);
		 
		
		
		int msf = 28;//msf 是 麻少飞
		int zjm = 23;//zjm 是 张嘉敏
		String father = msf > zjm ? "麻少飞大" : "张嘉敏大";
		System.out.println(father);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
