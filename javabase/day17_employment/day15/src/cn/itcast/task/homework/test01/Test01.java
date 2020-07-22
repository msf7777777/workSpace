package cn.itcast.task.homework.test01;

import java.io.File;

/*
请在D盘根目录下创建一个文件：test1.txt(随意录入一些内容)，再创建一个目录：测试目录
	请编写main()方法，创建以下两个File对象：
		File file1 = new File(“d:\\test1.txt”;
		File file2 = new File(“d:\\测试目录”);
	要求：
		1. 获取、打印file1和file2的绝对路径；
		2. 获取、打印file1和file2的文件名和目录名；
		3. 获取、打印file1和file2的文件大小；
		4. 分别判断file1和file2是否存在；
		5. 分别判断file1和file2是否是文件？是否是目录？
 */
public class Test01 {

    public static void main(String[] args) {
        File file1 = new File("d:\\test1.txt");
        File file2 = new File("d:\\测试目录");
        //1. 获取、打印file1和file2的绝对路径；
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        //	2. 获取、打印file1和file2的文件名和目录名；
        System.out.println(file1.getName());
        System.out.println(file2.getName());
        //3. 获取、打印file1和file2的文件大小；
        System.out.println(file1.length());
        System.out.println(file2.length());
        //4. 分别判断file1和file2是否存在；
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        //	5. 分别判断file1和file2是否是文件？是否是目录？
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());


    }
}
