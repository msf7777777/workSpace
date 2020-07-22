package cn.itcast.code.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
    /*
        注意事项:
            io只能操作文件不能操作文件夹!!!!!!!
            否则会报: FileNotFoundException 拒绝访问
     */
    public static void main(String[] args) throws IOException {
      /*  String[] arr = {"床前明月光","汗滴禾下土","举头望明月","粒粒真辛苦"};
        // 统计 dpcq.txt 字符的个数*/
        FileOutputStream out = new FileOutputStream("d://developer");
        out.write(97);
        out.close();

      /*  FileInputStream fis = new FileInputStream("d://developer");
        int read = fis.read();
        fis.close();*/


    }
}
