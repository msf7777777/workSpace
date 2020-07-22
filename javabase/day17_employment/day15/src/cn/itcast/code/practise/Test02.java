package cn.itcast.code.practise;

import java.io.*;

/**
 *  使用字节流拷贝斗破苍穹小说
 */
public class Test02 {

    public static void main(String[] args) throws IOException {
        //1.输入流关联源
        FileReader fis = new FileReader("d://dpcq.txt");
        //2.输出流关联目的
        FileWriter fos = new FileWriter("e://aaa.txt");
        long start = System.currentTimeMillis();
        char[] arr = new char[1024*8];
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
