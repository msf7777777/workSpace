package Diary0623;

public class day09_02_return_05 {
	public static void main(String[] args) {
		//�������ý����󣬷���ֵ����ռ�ݷ������õ�λ��
		System.out.println(f());
		System.out.println(g());
		f4(0);
	}
	//�������ý����󣬷���ֵ����ռ�ݷ������õ�λ�ã����ǡ�a����ռ�ݡ�f()����λ��
	public static int f(){//�������ý����󣬷���ֵ����ռ�ݷ������õ�λ��
		return 'a';//�������ý����󣬷���ֵ����ռ�ݷ������õ�λ��
	}
	public static int g(){
		//������룬��Ҫ����������ǿ��ת��
//		return 10L;
		//ǿ��ת���п��ܻ��ƻ����ݣ������������������
		return (int) 10L;
	}
	public static long h(){
		//int�����Զ�ת��Ϊlong�����Է���û������
		return 1;
	}
	//void����Ҳ����ʹ��return
	public static void f4(int num){
		if(num <=0){
			System.out.println("�Ƿ�����");
			//��return;����ʾ��ֹ����ִ��
			return;
		}
		for(int i = 1;i <= num;i++){
			for(int j = 1;j <= i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	//return���治�ܸ��������
	public static int k(){
		return 1;
//		System.out.println("");//�������return���治�ܸ��������
	}
}
