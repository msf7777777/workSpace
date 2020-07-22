package cn.itcast.code.charstream.writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    - `public abstract void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
    - `public abstract void flush() ` ：刷新此输出流并强制任何缓冲的输出字符被写出。
    - `public void write(int c)` ：写出一个字符。
    - `public void write(char[] cbuf)`：将 b.length字符从指定的字符数组写出此输出流。
    - `public abstract void write(char[] b, int off, int len)` ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
    - `public void write(String str)` ：写出一个字符串。
    总结:
        flush和close的区别
        flush: 刷新缓冲区中的字节数据到硬盘上,刷完流还可以继续使用
        close: 关闭资源, 在关闭前, 会将缓冲区中的数据刷新到硬盘上,流关闭之后不能再使用
 */
public class Test02 {

    public static void main(String[] args) throws IOException {
        //1.创建输出流关联文件
        FileWriter fw = new FileWriter("d://b.txt");
        //2.使用方法来去写数据到文件中
        //- `public void write(int c)` ：写出一个字符。
        //fw.write('c'); //效率比较低, 所以我们一般不用
        //- `public void write(char[] cbuf)`
        //char[] arr = {'我','爱','林','青','霞'};
        //fw.write(arr);
        //- `public abstract void flush() ` ：刷新此输出流并强制任何缓冲的输出字符被写出。
        //将缓冲区中, 的字节数据刷新到硬盘上
        //fw.write(arr);
        //fw.flush();
       // fw.flush();
        //- `public abstract void flush() ` ：刷新此输出流并强制任何缓冲的输出字符被写出。
        //将缓冲区中, 的字节数据刷新到硬盘上
        //    - `public abstract void write(char[] b, int off, int len)` ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
        //char[] arr = {'我','爱','林','青','霞'};
        //fw.write(arr,0,3);
       // - `public void write(String str)` ：写出一个字符串。
        fw.write("我爱林青霞");

        //3.释放资源
        fw.close();
    }
}
