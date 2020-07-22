package cn.itcast.task;
/*
1. 定义Demo01类, 在main方法中调用printHelloWorld()方法, 用来打印3次HelloWorld.
		目的: 本题主要考察两点.
			1. 无参无返回的方法 的定义和调用.
			2. 方法的功能越单一越好.

		简单版:
		提示:
			1. 在main方法外边定义printHelloWorld()方法.
			2. 在printHelloWorld()方法内部打印一次: "Hello World"
			3. 在main方法内部: 通过for循环, 调用三次 printHelloWorld()方法.

		升级版:
			1. 定义方法printHelloWorld2(), 该方法接收一个整数.
			2. 在方法内部实现, 根据传入的整数, 打印对应次数的"Hello World!"
			3. 在main方法中调用 printHelloWorld2()方法.
	*/
public class task01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            printHelloWorld();
        }
    }

    public static void printHelloWorld() {
        System.out.println("HelloWorld");
    }
}
