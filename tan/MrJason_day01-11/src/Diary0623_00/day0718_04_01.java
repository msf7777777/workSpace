package Diary0623_00;

public class day0718_04_01 {
	public static void sum(int start,int end){
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sum(1,100);
	}
}
