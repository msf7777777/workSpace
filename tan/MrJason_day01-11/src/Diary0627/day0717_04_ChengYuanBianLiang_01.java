package Diary0627;

public class day0717_04_ChengYuanBianLiang_01 {
	public static void main(String[] args) {
		//f��������ͻ������͵���������һ����
		Foo f = new Foo();
		//ʵ�����������ڶ���ģ�ͨ������������
		f.age = 10;
		System.out.println(f.age);
		
		//�������������ģ�ͨ������������
		Foo.count = 5;
		System.out.println(Foo.count);
		
		//�ೣ��Ҳ��������ģ�ͨ������������
		System.out.println(Foo.PI);
		
		//ʵ�����������ڶ���ģ�ʵ��������ֵ�Ǵ�ŵ������еģ�ÿ��������һ�ݣ�����Ķ����ʵ���������໥�����ġ�
		//�������������ģ��������ֵ�Ǵ�������еģ�������ֻ��һ������������ֻ��һ��
		//�ೣ��Ҳ��������ģ�Ҳ��ֻ��һ��
		
		//���������ͨ�����������ʣ�Ҳ����ͨ�����������ʣ����Ƽ���
		System.out.println(f.count);//���뾯��
		
	}
}
