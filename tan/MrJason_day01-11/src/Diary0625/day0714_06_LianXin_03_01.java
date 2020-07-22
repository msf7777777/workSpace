package Diary0625;
//错误！！！这个叫倒序输出，不是反转！！！
public class day0714_06_LianXin_03_01 {
	//【作业】数组反转[12345]---[54321]
	public static void main(String[] args) {
		int[] arr = {555,67,985,211,886,666};
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
