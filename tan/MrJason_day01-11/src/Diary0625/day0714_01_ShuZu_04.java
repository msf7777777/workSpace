package Diary0625;

public class day0714_01_ShuZu_04 {
	public static void main(String[] args) {
		//可以使用更简洁的方式来创建和初始化
		//{10,20,30,40,50}创建了一个长度为5的int数组，元素分别为10,20,30,40,50
		int[] arr = {11,20,33,40,55};
		
		System.out.println(arr[1]);//取第二个元素
		
		//获取数组的长度“arr.length”
		System.out.println(arr.length);
		
		//获取数组的最后一个元素
		System.out.println(arr[arr.length - 1]);
		
	}
}
