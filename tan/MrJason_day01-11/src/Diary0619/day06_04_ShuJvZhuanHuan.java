package Diary0619;

public class day06_04_ShuJvZhuanHuan {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		int e;
		e = a + b;
//		short e = a + b;// 错误编译（类型不匹配：无法从int转换为short）
		System.out.println(a + b);//【3】
//		int e = a + b;
		
		byte f = a;
		short g = a;
		long h = a;
		
		long m = 5;
//		byte x = m;// 错误编译(类型不匹配：无法从long转换为byte)
//		short y = m;// 错误编译(类型不匹配：无法从long转换为short)
//		int z = m;// 编译错误(类型不匹配：无法从long转换为int)
		
		int n = 6;
//		byte x = n;// 编译错误(同上)
//		short y = n;// 编译错误(同上)
		
		short o = 7;
//		byte x = o;// 编译错误(同上)
		
		
		
		
		
		
	}
}
