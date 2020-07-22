package cn.itcast.code.charstream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    成员方法:
    - `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
    - `public int read()`： 从输入流读取一个字符。
    - `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d://b.txt");
        //- `public int read()`： 从输入流读取一个字符。
        //读取内容
        /*while (true){
            int ch = fr.read();
            if(ch == -1){
                break;
            }
            System.out.println((char)ch);
        }*/


        int ch;
        while ((ch= fr.read()) != -1){
            System.out.println((char)ch);
        }
        fr.close();

      /*  int ch = fr.read();
        System.out.println((char)ch);
        ch = fr.read();
        System.out.println((char)ch);
        ch = fr.read();
        System.out.println((char)ch);
        ch = fr.read();
        System.out.println((char)ch);
        ch = fr.read();
        System.out.println((char)ch);
        ch = fr.read();
        System.out.println(ch);
        ch = fr.read();
        System.out.println(ch);*/
    }
}
