package Diary0619;

public class day06_09_YunSuanFu_BiJiao {
	public static void main(String[] args) {
		System.out.println(1 == 2);//°æfalse°ø
		System.out.println(1 == 1);//°ætrue°ø
		
		boolean	a = true;
		boolean b = false;
		System.out.println(a);//°ætrue°ø
		System.out.println(b);//°æfalse°ø
		
		System.out.println(1<2);//°ætrue°ø
		System.out.println(1>2);//°æfalse°ø
		System.out.println(1<1);//°æfalse°ø
		
		int c = 3;
		byte d = 4;
		System.out.println(c<d);//°ætrue°ø
		System.out.println(c>d);//°æfalse°ø
		System.out.println(c<=d);//°ætrue°ø
		System.out.println(c>=d);//°æfalse°ø
		System.out.println(c!=d);//°ætrue°ø
		System.out.println(c==d);//°æfalse°ø
		
		int x = 1;
		int y = 1;
//		int z = x == y;// ¥ÌŒÛ±‡“Î
		boolean z = x == y;
		System.out.println(z);//°ætrue°ø
		boolean m = x <= y;
		System.out.println(m);//°ætrue°ø
		boolean n = x !=y;
		System.out.println(n);//°æfalse°ø
//		boolean o == x = y;// ±‡“Î¥ÌŒÛ
		int o = 1;
//		boolean o == x = y;// ±‡“Î¥ÌŒÛ
		
		x++;
		System.out.println(x);//°æ2°ø
		++y;
		System.out.println(y);//°æ2°ø
		
		boolean p = 1 == 1;
		System.out.println(p);//°ætrue°ø
		
		boolean q = 2 < 1;
		System.out.println(q);//°æfalse°ø
		
		boolean r = y < 1;
		System.out.println(r);
		
//		boolean s = 3 < 2 < 1;// ¥ÌŒÛ±‡“Î
		
		
		
	}
}
