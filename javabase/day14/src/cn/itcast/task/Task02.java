package cn.itcast.task;

import java.io.File;
import java.io.IOException;

/*
1.2 题目二
	请编写main()方法，创建以下File对象：
		File file1 = new File(“test.txt”);//相对路径，在项目根目录下
		File file2 = new File(“一级目录”);
		File file3 = new File(“目录A/目录B/目录C”);
	要求：
		1. 判断file1是否存在？如果不存在，创建这个文件。
		2. 判断file2是否存在？如果不存在，创建这个目录。
		3. 判断file3是否存在？如果不存在，创建这个多级目录。
 */
public class Task02 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("test.txt");
        File file2 = new File("一级目录");
        File file3 = new File("目录A/目录B/目录C");
        boolean exists1 = file1.exists();
        if(exists1 == false){
            boolean newFile = file1.createNewFile();
            System.out.println(newFile);
        }
        boolean exists2 = file2.exists();
        if(exists2 == false){
            boolean mkdirs = file2.mkdirs();
            System.out.println(mkdirs);
        }
        boolean exists3 = file3.exists();
        if(exists3 == false){
            boolean mkdirs = file3.mkdirs();
            System.out.println(mkdirs);
        }

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file3.getAbsoluteFile());
    }
}
