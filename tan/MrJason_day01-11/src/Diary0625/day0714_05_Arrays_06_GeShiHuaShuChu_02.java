package Diary0625;

public class day0714_05_Arrays_06_GeShiHuaShuChu_02 {
	public static void main(String[] args) {
		int[] arr = {20,4,16,80};
		int[] arr1 = {20,4,16,80};
		int[] arr2 = arr;
		//格式化输出
		System.out.println(arr);//【[I@15db9742】这个是内存地址
		System.out.println(arr1);//【[I@6d06d69c】
		System.out.println(arr2);//【[I@15db9742】
	}
}
