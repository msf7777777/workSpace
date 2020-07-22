package cn.itcast.code.BufferedStream.bytebuffer;

import java.io.*;

public class Test2 {

    public static void main(String[] args) throws IOException {
        //使用缓冲流来去帮助我们拷贝 d://a.mp3到e://a.mp3
        //1.源 ---> 输入流关联
        //FileInputStream fis= new FileInputStream("d://a.mp3");// alt + enter
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d://a.mp3"));
        //2.目的 --->输出流关联
        //FileOutputStream fos = new FileOutputStream("e://a.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e://a.mp3"));
        //3.一个字节一个字节的拷贝
        long start = System.currentTimeMillis();
        int by;//定义变量记录读出来的字节
        while((by = bis.read())!=-1){
            bos.write(by);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //4.关闭资源
        bis.close();
        bos.close();
    }
}
