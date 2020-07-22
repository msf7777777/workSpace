package cn.itcast.task.homework.test02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
第二题:
	将dpcq.txt以一次读一行的方式展示到控制台上
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day02/dpcq.txt"));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
