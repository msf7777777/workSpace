package Diary0625;

public class day0714_06_LianXin_02_00_Jason {
	//【作业】找出数组中元素的最大值和下标【Jason】
	public static void max(int[] arr) {
		int result = arr[0] - 1;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(result < arr[i]) {
				result = arr[i];
				index = i;
			}
		}
		System.out.println(result);
		System.out.println(index);
	}
	public static void main(String[] args) {
		int[] arr = {555,67,985,211,886,666};
		max(arr);
	}
}
