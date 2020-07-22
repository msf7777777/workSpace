package Diary0625;
//
public class day0714_06_LianXin_01_00_Jason {
	//【作业】找出数组中元素的最大值【Jason的答案】
	public static int max(int[] arr) {
		int result = arr[0] - 1;
		for (int i = 0; i < arr.length; i++) {
			if(result < arr[i]) {
				result = arr[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {555,67,985,211,886,666};
		System.out.println(max(arr));
	}
}
