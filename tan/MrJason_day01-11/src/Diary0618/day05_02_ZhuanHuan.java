package Diary0618;

public class day05_02_ZhuanHuan {
	public static void main(String[] args) {
		int i = 10;
		long lg = i;
		System.out.println(lg);//��10��
		
		int a = 9;
		long b = a;
		double c = b;
		System.out.println(b);//��9��
		System.out.println(c);//��9.0��
		
		float d = a;
		System.out.println(d);//��9.0��
		
	    d = b;
//������� d = c; ���Ͳ�ƥ�䣺�޷���doubleת��Ϊfloat
		d = a;
		
		System.out.println(d);//��9.0��
		
		float e = 8;
		double f = e;
		System.out.println(f);//��8.0��
		
		double g = 5;
//�������	float h = g; ���Ͳ�ƥ�䣺�޷���doubleת��Ϊfloat
		
		byte x = 10;
		short y = 20;
		//short z = y;
		short z;
//�������	short z = x + y;
		
		int X = x;
		int Y = y;
//		int Z = z;
//		Z = X + Y;
//		System.out.println(z);//��20��
		
		//char Z = 'z';
//		System.out.println(Z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
