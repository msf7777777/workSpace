package No13_�ӿ�;

/* ���ӿڡ�
 * �ӿڶ�����һ�������ܶ����ṩ�Ĺ��ܡ�
 * �ӿڲ��ܱ�ʵ������ֻ�ܱ�ʵ�֡� 
 * �ӿڿ������Ϊ����ĳ����࣬�ӿ���
 * �����з������ǳ���ġ� �ӿ�������һ�ֹ���*/

//ʹ�ùؼ���interface����һ���ӿڡ��ӿ��������ܡ�
interface Flyable {
	// public abstract ���Ǳ���ģ��ӿڵķ���Ĭ����public abstract��
	// public abstract void fly();
	void fly();
	public abstract void fuck();//����Ҳ�ǿ��Ե�
}

//ʹ�ùؼ���implements��ʵ��һ���ӿڡ���ʵ�ֽӿ��������Ĺ��ܡ�
class Aeroplane implements Flyable {
	//ʵ��һ���ӿڣ�����ʵ�ֽӿ��е����з�������������������Ϊ������
	@Override
	public void fly() {
		System.out.println("�ɻ��ܷɣ��ɻ�ʹ�÷�������");
	}
	
	public void fuck() {
		System.out.println("�һ���fuck");
	}
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("���ܷɣ���ʹ�ó���");
	}
	
	public void fuck() {
		System.out.println("��Ҳ��fuck");
	}
}

abstract class Zjm implements Flyable {
	//ʵ��һ���ӿڣ����û��ʵ�ֽӿ��е����з�������������������Ϊ������
}

public class day1309 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();//�����ܷɣ���ʹ�ó��ɡ�
		System.out.println("----------��1��----------");
		
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();//���ɻ��ܷɣ��ɻ�ʹ�÷������ɡ�
		System.out.println("----------��2��----------");
		
		//�ӿ����͵ı�����������ʵ��������ӿڵ����ʵ��
		Flyable flyable1 = new Bird();//Birdʵ����Flyable�ӿڣ�������������Ա�flyable1����
		flyable1.fuck();//����Ҳ��fuck����̬������������ö����fly����
		System.out.println("----------��3��----------");
		
		Flyable flyable2 = new Aeroplane();//Aeroplaneʵ����Flyable�ӿڣ�������������Ա�flyable1����
		flyable2.fuck();//���һ���fuck����̬������������ö����fly����
		System.out.println("----------��4��----------");
	}
	
}
