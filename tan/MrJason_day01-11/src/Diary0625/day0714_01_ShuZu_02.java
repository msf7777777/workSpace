package Diary0625;

public class day0714_01_ShuZu_02 {
	public static void main(String[] args) {
		//数组是应用类型的
		//申明一个数据变量
		//变量的类型就是int[],int是数组中元素的类型
		//这个申明并不会真正的创建数组，他只是神明了一个可以引用int类型数组的变量
		int[] arr;//这个变量现在没有存放任何数据
		
		//使用new操作符创建一个可以容纳10个int的数组
		//将数组的引用（地址）复制给arr,这样变量arr就引用了这个数组
		//数组相当于空调，数组变量arr相当于空调的遥控器，通过遥控器可以操控空调
		arr = new int[10];
		
		//将数组变量arr的值（它所引用的数组的地址）赋值给数组变量arr1
		//现在arr和arr1引用同一个数组
		int[] arr1 = arr;
		
		//将10赋值给arr所引用的数组
		arr[0] = 14;
		//取出arr1引用的数组的第一个元素的值
		System.out.println(arr1[0]);//arr[0] = arr1 [0] 相当于1台空调两个遥控器
		
	}
}
