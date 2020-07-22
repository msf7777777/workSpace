package Diary0623;

public class day09_02_return_02 {
	//计算两个数字之间的所有数字的和
	//int指示此方法在执行结束后将返回一个int数值给调用者main方法
	public static int sum(int start,int end){//注意：“static”后面换成了“int”
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		//sum的值可以返回给慢方法
		//实际返回的数据类型必须和申明的返回值的类型相匹配
		return sum;
	}
	public static void main(String[] args) {
		//将sum方法的返回值赋值给result变量
		int result = sum(1,3);
		System.out.println(result);
	}
}