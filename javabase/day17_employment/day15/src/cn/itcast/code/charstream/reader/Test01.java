package cn.itcast.code.charstream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
    构造:
		FileReader(String fileName)
	总结:
	    一定要保证文件存在才可以,否则报	FileNotFoundException异常
 */
public class Test01 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("d://c.txt");

    }
}
