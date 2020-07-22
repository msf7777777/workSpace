package Diary0618;

public class day04_08_BianLiang_LeiXing {
	public static void main(String[] args) {
		int number = 5;
		//编译错误 number=1.2
		
		int age=10;
		
		
		// number = 1.2;//编译错误
		//byte,short,int,long都可以存放整数，只是取值范围不同
		//byte能存放的数据的取值范围是-128到127
		byte b = 1;
		System.out.println(b);//【1】
		short s = 2;
		System.out.println(s);//【2】
		int i = 3;
		System.out.println(i);//【3】
		long log = 4;
		System.out.println(log);//【4】
		//float和double可以存放小数，float是单精度，double是双精度
		//double的精度高，小数位数多
		//一般使用double来存放小数
		float f = 5.0f;//使用float需要在数值的后面加f
		// f = 5.0;//编译错误，因为字面值5.0默认类型是double
		System.out.println(f);//【5.0】
		double d = 6.0d;//使用double需要在数值的后面加d
		d = 6.0;//double可以不用加d，因为字面值6.0默认类型是double
		System.out.println(d);//【6.0】
		//char可以存放一个字符
		char c = 'a';
		c = '中';
		// c = '中国';//编译错误，char可以存放一个字符
		//c = "国";//编译错误，因为双引号代表字符串，不能赋值给字符变量
		System.out.println(c);//【中】
		//boolean只有两个值，true（真）和false（假）
		boolean bl = true;
		System.out.println(bl);//【true】
		
		double msf = 7.0;
		msf = 7;
		System.out.println(msf);//【7.0】
		
		boolean msf7777777 = false;
		System.out.println(msf7777777);//【false】
		
		int	a =	10;
		
		boolean A = true;
		//编译错误 int	a =	10;
		System.out.println(A);//【true】
		
		int B = 10;
		final int C = 10;
		double D = 22.22;
		final double E = 33.33;
		System.out.println(E);//【33.33】
		
		System.out.println(D + E);//【55.55】
		D = 11.11d;
		System.out.println(D + E);//【44.44】
		
		char F = '飞';
		System.out.println(F);//【飞】
		
		F = '飝';
		System.out.println(F);//【飝】
		
		float G = 6.06070809010203f;
		System.out.println(G);//【6.060708】
		
		boolean one;
		one = true;
		System.out.println(one);//【true】
		
		one = false;
		System.out.println(one);//【false】
		
		final boolean two = false;
		System.out.println(two);//【false】
		
		int H = 5;
		final int I = H;
		System.out.println(I);//【5】
		
		System.out.println(16 * 1024 * 1024);//【16777216】16MB * 1024
		System.out.println(16869000 / (1024 * 1024));//【16】
		
		System.out.println(1024 * 1024);//【16】
		System.out.println(16869000 / 1048576);//【16】16.08753204345703
		
		double J = 16869000 / 1048576;
		System.out.println(J);//【16.0】16.08753204345703
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
