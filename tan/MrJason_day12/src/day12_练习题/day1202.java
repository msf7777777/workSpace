package day12_��ϰ��;
class Foo {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	String str;
}
//java��һ�����ļ������ж���࣬����ֻ����һ��public��
//public�������Ҫ���ļ�����ͬ
public class day1202 {
	public static void main(String[] args) {
		// int i;
		// System.out.println(i);//�������iû�г�ʼ��
		Foo foo = new Foo();
		System.out.println(foo.b);//0
		System.out.println(foo.s);//0
		System.out.println(foo.c);//
		System.out.println(foo.i);//0
		System.out.println(foo.l);//0
		System.out.println(foo.f);//0.0
		System.out.println(foo.d);//0.0
		System.out.println(foo.bool);//false
		//null��ʾ���������κζ���
		System.out.println(foo.str);//null StringΪ�������ͣ���������Ĭ��ֵΪnull
		}
	
}
