package cn.itcast.code.bytestream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    成员方法:
        - `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
        - `public void flush() ` ：刷新此输出流并强制任何缓冲的输出字节被写出。
        - `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
        - `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
        - `public abstract void write(int b)` ：将指定的字节输出流。

        总结:
            使用步骤:
                1.创建输出流对象
                2.调用写数据的方法(通过使用的写字节数组的方法)
                3.释放资源
            重点:
                会写一个字节数组数据write(byte[] b)
                会写一个字节数组的一部分数据write(byte[] b, int off, int len)

 */
public class Test02 {

    public static void main(String[] args) throws IOException {

        //1.创建输出流关联硬盘
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        //2. 使用写数据的方法
        /*- `public abstract void write(int b)` ：将指定的字节输出流。,
        这个方法基本上用不到因为效率太低!!!!!!
        */
        //fos.write(97);
        /*
        - `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
            这个效率比较高, 建议使用
         */
//        byte[] arr = {97,98,99};
//        fos.write(arr);
        /*
         - `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏
           作用: 将数组中的一部分内容写到硬盘上
         */
        byte[] arr = {97,98,99};
        fos.write(arr,0, 2);
        //3.IO是向系统申请资源,操作硬盘, 用完后要释放资源,否则对系统资源是一种大的浪费
        //- `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
       // fos.close();
        fos.close();



    }
}
