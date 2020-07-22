package cn.itcast.code.bytestream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
    构造:
        FileOutputStream(String name)
        FileOutputStream(String name, boolean append)
 */
public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建输出流, 目的地指向我们d:盘的a.txt
        /*
            输出流的空参构造办的事情
                1.创建了输出流对象
                2.指向了硬盘的文件
                3.如果文件不存在,则帮我们创建出来,如果文件存在,则帮我们清空里面的内容
             注意事项:
                他确实可以帮我们创建文件, 但是不会帮我们创建文件夹,所以我们必须
                保证我们关联的文件所在文件夹要存在才可以

         */
        FileOutputStream out = new FileOutputStream("d://a//a/a/a//a/a/aa/a.txt");
        System.out.println(out);
    }
}
