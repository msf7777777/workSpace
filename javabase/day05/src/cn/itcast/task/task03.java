package cn.itcast.task;
/*
3. 定义Demo05类, 在main中调用printArray()方法, 用来打印数组.
		目的: 本题主要考察两点.
			1. 有参无返回的方法 的定义和调用.
			2. 方法的形参可以是数组类型的变量.

		提示:
			1. 在main方法外边定义printArray()方法.
			2. printArray()方法接收一个int类型的数组变量.
			3. 在printArray()方法内部实现 遍历数组, 注意: 不需要返回值.
			4. 在main方法中调用printArray()方法.
	*/
public class task03 {
    public static void main(String[] args) {
        printArray(new int[]{11, 22, 33});
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
