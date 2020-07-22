package cn.itcast.code.bytestream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    构造:
        FileInputStream(String name)
 */
public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            1.创建了一个输出流对象
            2.关联了硬盘上的文件
            注意:
                读数据的时候一定要保证文件存在才可以, 否则会报FileNotFoundException异常

         */
        FileInputStream fis = new FileInputStream("d:/a.txt");
    }
}
