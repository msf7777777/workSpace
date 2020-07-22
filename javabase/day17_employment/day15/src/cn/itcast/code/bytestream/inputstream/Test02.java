package cn.itcast.code.bytestream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
  - `public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。
- `public abstract int read()`： 从输入流读取数据的下一个字节。
- `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
 */
public class Test02 {

    public static void main(String[] args) throws IOException {
        //创建输出流关联文件
        FileInputStream fis = new FileInputStream("d:/a.txt");
        //使用方法去将文件内容读到内存中
        //- `public abstract int read()`： 从输入流读取数据的下一个字节。

        int by;// 用来记录读出来的每一个字节数据
        while((by = fis.read())!=-1){
            System.out.println(fis.read());
        }
        //释放资源
        fis.close();


       /* while (true){
            int read = fis.read();
            if(read == -1){
                break;
            }
            System.out.println(read);
        }*/

        /*int read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);

        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);*/
    }
}
