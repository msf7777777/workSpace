package Diary0625;

public class day0714_01_ShuZu_05 {
	public static void main(String[] args) {
		//动态创建数组
		int n = 10;
		int[] arr = new int[n];
		
		//数组的默认值
		//创建一个数字数组（byte,short,int,long）所有元素都初始化为0
			//float和double初始化是0.0
		//boolean类型的初始化为false
		//数组中元素如果是引用类型，那么初始化为null，表示此元素不引用任何对象
			//对象数组初始化为null(String类型数组初始化为null)
		int[] arr1 = new int[5];
		//变量数组中的所有元素
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
