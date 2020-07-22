package Diary0623;

public class day09_03_ChongZai_02 {
	//a和b那个数大就返回那个数
	public static int max(int a,int b){
		return a > b ? a : b;
	}
	public static double max(double a,double b){
		return a > b ? a : b;
	}
	public static void main(String[] args) {
		//在调用方法的时候，编译器会根据实际参数的类型查找匹配的方法
		System.out.println(max(1,2));
		System.out.println(max(1.0,2.0));
	}
}
