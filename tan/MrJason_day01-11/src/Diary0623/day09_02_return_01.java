package Diary0623;

public class day09_02_return_01 {
	//������������֮����������ֵĺ�
	//intָʾ�˷�����ִ�н����󽫷���һ��int��ֵ��������main����
	public static void sum(int start,int end){
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		//sum��ֵ���Է��ظ�������
	}
	public static void main(String[] args) {
		sum(1,3);
	}
}
