package Diary0619;

public class day06_09_YunSuanFu_BiJiao {
	public static void main(String[] args) {
		System.out.println(1 == 2);//��false��
		System.out.println(1 == 1);//��true��
		
		boolean	a = true;
		boolean b = false;
		System.out.println(a);//��true��
		System.out.println(b);//��false��
		
		System.out.println(1<2);//��true��
		System.out.println(1>2);//��false��
		System.out.println(1<1);//��false��
		
		int c = 3;
		byte d = 4;
		System.out.println(c<d);//��true��
		System.out.println(c>d);//��false��
		System.out.println(c<=d);//��true��
		System.out.println(c>=d);//��false��
		System.out.println(c!=d);//��true��
		System.out.println(c==d);//��false��
		
		int x = 1;
		int y = 1;
//		int z = x == y;// �������
		boolean z = x == y;
		System.out.println(z);//��true��
		boolean m = x <= y;
		System.out.println(m);//��true��
		boolean n = x !=y;
		System.out.println(n);//��false��
//		boolean o == x = y;// �������
		int o = 1;
//		boolean o == x = y;// �������
		
		x++;
		System.out.println(x);//��2��
		++y;
		System.out.println(y);//��2��
		
		boolean p = 1 == 1;
		System.out.println(p);//��true��
		
		boolean q = 2 < 1;
		System.out.println(q);//��false��
		
		boolean r = y < 1;
		System.out.println(r);
		
//		boolean s = 3 < 2 < 1;// �������
		
		
		
	}
}
