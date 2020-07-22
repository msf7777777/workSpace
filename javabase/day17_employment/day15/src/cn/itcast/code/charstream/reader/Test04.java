package cn.itcast.code.charstream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    统计斗破苍穹里面的字符个数
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:/dpcq.txt");
        long start = System.currentTimeMillis();
        int count = 0;
        int ch;
        while ((ch = fr.read())!=-1){
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //释放资源
        fr.close();
        System.out.println("总字符个数为:"+ count);
    }
}
