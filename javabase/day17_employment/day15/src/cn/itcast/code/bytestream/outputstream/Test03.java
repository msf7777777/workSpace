package cn.itcast.code.bytestream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    如何续写:
         FileOutputStream(String name, boolean append)
 */
public class Test03 {

    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象, 并且以续写的方式来去关联
        /*
            如果文件不存在则帮我们创建, 如果文件存在, 则不会清空内容
         */
        FileOutputStream fos = new FileOutputStream("d:/a.txt",true);
        //2.调用写数据的方法来写
        fos.write(97);
        //3.释放资源
        fos.close();

    }
}
