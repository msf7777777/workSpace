package cn.itcast.code.practise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    字符流是否可以拷贝图片,音频,视频,等二进制文件 ???
    字符流不能拷贝咱们的二级制文件, 因为二进制文件中很多东西在码表中不存在, 而且规则
    也不一样, 有可能在查询码表的时候, 丢失数据, 被替换成控制符

 */
public class Test03 {

    public static void main(String[] args) throws IOException {
        //1.输入流关联源
        FileReader fis = new FileReader("d://quanwang.png");
        //2.输出流关联目的
        FileWriter fos = new FileWriter("e://quanwang.png");
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
