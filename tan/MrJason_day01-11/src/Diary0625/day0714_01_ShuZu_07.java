package Diary0625;

public class day0714_01_ShuZu_07 {
	public static void main(String[] args) {
		int[] arr = {100,200,300,400,500};
		//使用for循环遍历数组中的所有元素
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("**********【1】**********");
		
		//使用foreach来遍历数组
		//每次执行迭代时，将arr中对应的元素取出，赋值给i
		//i代表当前元素，因为在执行迭代时会计数
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("**********【2】**********");
		
		String[] arr1 = {"a","b","c"};
		//String是元素的类型
		for(String str : arr1){
			System.out.println(str);
		}
		System.out.println("**********【3】**********");
		
		//增强的for循环不能修改元素的值
		for (int i : arr) {
			i = 1;
		}
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("**********【4】**********");
	}
}
