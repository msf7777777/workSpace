package cn.itcast.code.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
    一次一个字节一个自己的复制
    以后不会这样去写因为效率太低
 */
public class Test01 {
    //将d://quanwang.png ----> e://quanwang.png
    public static void main(String[] args) throws IOException {
        //1.创建输入流关联源
        FileInputStream fis = new FileInputStream("d://a.avi");
        //2.创建输出流关联目的
        FileOutputStream fos = new FileOutputStream("e://a.avi");
        long start = new Date().getTime();
        //3.读源写目的
        int by;
        while ((by = fis.read()) != -1) {
            //将读到的数据,通过输出流写到目的地中
            fos.write(by);
        }
        long end = new Date().getTime();
        System.out.println(end - start);
        //4.释放资源
        fis.close();
        fos.close();


    }
}
