package Diary0623;

public class day09_02_return_01 {
	//计算两个数字之间的所有数字的和
	//int指示此方法在执行结束后将返回一个int数值给调用者main方法
	public static void sum(int start,int end){
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		//sum的值可以返回给慢方法
	}
	public static void main(String[] args) {
		sum(1,3);
	}
}
