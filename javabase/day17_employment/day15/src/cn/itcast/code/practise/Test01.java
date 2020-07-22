package cn.itcast.code.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  使用字节流拷贝斗破苍穹小说
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        //1.输入流关联源
        FileInputStream fis = new FileInputStream("d://dpcq.txt");
        //2.输出流关联目的
        FileOutputStream fos = new FileOutputStream("e://dpcq.txt");
        long start = System.currentTimeMillis();
        byte[] arr = new byte[1024*8];
        int len;//接受读取的有效个数
        while((len = fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //释放资源
        fis.close();
        fos.close();

    }
}
