package Diary0618;

public class day05_02_ZhuanHuan {
	public static void main(String[] args) {
		int i = 10;
		long lg = i;
		System.out.println(lg);//【10】
		
		int a = 9;
		long b = a;
		double c = b;
		System.out.println(b);//【9】
		System.out.println(c);//【9.0】
		
		float d = a;
		System.out.println(d);//【9.0】
		
	    d = b;
//编译错误 d = c; 类型不匹配：无法从double转换为float
		d = a;
		
		System.out.println(d);//【9.0】
		
		float e = 8;
		double f = e;
		System.out.println(f);//【8.0】
		
		double g = 5;
//编译错我	float h = g; 类型不匹配：无法从double转换为float
		
		byte x = 10;
		short y = 20;
		//short z = y;
		short z;
//编译错误	short z = x + y;
		
		int X = x;
		int Y = y;
//		int Z = z;
//		Z = X + Y;
//		System.out.println(z);//【20】
		
		//char Z = 'z';
//		System.out.println(Z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
