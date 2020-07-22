package cn.itcast.code.charstream.writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    构造:
        FileWriter(String fileName)
        FileWriter(String fileName, boolean append)
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        // FileWriter(String fileName)
        /*
            1.创建了输出流对象
            2.指向了硬盘上的文件
            3.如果文件不存在则帮我们创建文件, 如果存在,则清空内容
            注意事项:
                输出流可以帮我们创建文件的, 但是不能帮我们创建文件夹,
                如果文件所在的目录不存在的话 ,会报FileNotFoundException
         */
        FileWriter writer = new FileWriter("d://a/a/a//a//a/a/a/b.txt");



    }
}
