package cn.itcast.code.charstream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:/dpcq.txt");
        long start = System.currentTimeMillis();//5862600
        int count = 0;
        char[] arr = new char[1024 * 8];
        int len;
        while ((len = fr.read(arr)) != -1) {
            count+=len;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //释放资源
        fr.close();
        System.out.println("总字符个数为:" + count);
    }
}
