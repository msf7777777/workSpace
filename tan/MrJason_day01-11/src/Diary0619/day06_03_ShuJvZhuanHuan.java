package Diary0619;

public class day06_03_ShuJvZhuanHuan {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		char c = 3;
		int d = 4;
		long e = 5;
		long f = 6;
		System.out.println(d + e);//【9】
		long g = e;
//		int h = e;// 错误编译 （类型不匹配：无法从long转换为int）
		System.out.println(d + e);//【9】
		int h = 7;
//		h = e;
		
		System.out.println(e);//【5】
		System.out.println(f);//【6】
		
		f = e;
		System.out.println(e);//【5】
		System.out.println(f);//【5】
		
		
		
		
		
		
		
		
		
		
		
	}	
}
