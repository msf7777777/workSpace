package Diary0619;

public class day06_10_DuanLu {
	public static void main(String[] args) {
		//��·������� &&��ֻҪһ����false����false��
		System.out.println(true && true);//��true��
		System.out.println(true && false);//��false��
		System.out.println(false && true);//��false��
		System.out.println(false && false);//��false��
		
		System.out.println(1 < 2 && 2 < 3);//��true��
		System.out.println(1 < 2 && 2 > 3);//��false��
		
		int a = 1;
		int b = 2;
		System.out.println(a < b);//��true��
		
		int c = 3;
		short d = 4;
		System.out.println(c > d);//��false��
		
		System.out.println("**********************");
		
		//��·������� ||��ֻҪһ����true����true��
		System.out.println(true || true);//��true��
		System.out.println(true || false);//��true��
		System.out.println(false || true);//��true��
		System.out.println(false || false);//��false��
		
		System.out.println(1 < 2 || 2 < 3);//��true��
		System.out.println(1 < 2 || 2 > 3);//��true��
		System.out.println(1 > 2 || 2 > 3);//��false��
		
		System.out.println("**********************");
		
		//��·��ָ��������Ѿ���ȷ�ˣ��Ͳ���Ҫ����ִ���ˡ�
		int x = 10;
		System.out.println(true && ++x == 11);//��true������ġ�++x == 11����ִ�еģ�����
		System.out.println(x);//��11��
		System.out.println(++x == 11 && true);//��false��
		System.out.println(x);//��12��
		
		System.out.println("**********************");
		
		int y = 10;
		System.out.println(true || ++y == 11);//��true��
		System.out.println(y);//��10��
		System.out.println(++y == 12 || ++y == 12);//��true��
		System.out.println(y);//��12��
		
		System.out.println("**********************");
		
		int z = 10;
		System.out.println(true | ++z == 12);
		System.out.println(z);//��11��
		System.out.println(true & ++z == 12);
		System.out.println(z);//��12��
		
		System.out.println("**********************");
		
		//&&��|| ִ��һ�߾��ܳ��������&��| ���߶�ִ�У�Ϊ�˽�ʡЧ�ʣ�����ѡ��&&��||
		
		System.out.println(true & true);//��true��
		System.out.println(true & false);//��false��
		System.out.println(false & true);//��false��
		System.out.println(false & false);//��false��
		
		System.out.println(true | true);//��true��
		System.out.println(true | false);//��true��
		System.out.println(false | true);//��true��
		System.out.println(false | false);//��false��
		
		System.out.println("**********************");
		
		//���^�������߽����ͬʱ��true����ͬʱ��false,���߶�ִ��
		System.out.println(true ^ true);//��false��
		System.out.println(true ^ false);//��true��
		System.out.println(false ^ true);//��true��
		System.out.println(false ^ false);//��false��
		
		System.out.println("**********************");
		
		//�ǣ���ȡ��
		System.out.println(!false);//��true��
		System.out.println(!true);//��false��
//		System.out.println(!a < b);// ������󣬶��ڲ�������intδ����
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
