package Diary0625;
//数组是一个容器，它可以保存一定数量的同一类型的数据。
//当数组创建完成后，它的长度就固定下来了。
//数组中每个数据都称为元素，每个元素都可以通过下标（index）来访问	
//数组有几个元素，它的长度就是几
//数组是一块儿连续的储存空间
//int数组，内部可以存放int数据，如果数组的第一个元素地址：0000,0004,0008
public class day0714_01_ShuZu_01 {
	public static void main(String[] args) {
		//申明一个数组
		int[] arr;
		//创建一个可以存放10个int的数组
		arr = new int[10];
		//给数组的第一个元素赋值为11
		arr[0] = 11;
		//给数组的第二个元素赋值为22
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		arr[5] = 66;
		arr[6] = 77;
		arr[7] = 88;
		arr[8] = 99;
		//长度为10的数组的最后一个元素的下标为9
		arr[9] = 110;
		
		//将数组的第一个元素与的值赋值给变量a
		int a = arr[0];
		System.out.println(a);
		System.out.println(arr[9]);
		
	}
}
