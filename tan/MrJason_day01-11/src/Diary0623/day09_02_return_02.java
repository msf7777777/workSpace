package Diary0623;

public class day09_02_return_02 {
	//������������֮����������ֵĺ�
	//intָʾ�˷�����ִ�н����󽫷���һ��int��ֵ��������main����
	public static int sum(int start,int end){//ע�⣺��static�����滻���ˡ�int��
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		//sum��ֵ���Է��ظ�������
		//ʵ�ʷ��ص��������ͱ���������ķ���ֵ��������ƥ��
		return sum;
	}
	public static void main(String[] args) {
		//��sum�����ķ���ֵ��ֵ��result����
		int result = sum(1,3);
		System.out.println(result);
	}
}