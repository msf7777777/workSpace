package cn.itcast.task.homework.test03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
第三题:
	键盘录入若干句话,直到录入"over"时结束录入, 请将录入的内容保存到文件中

 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day02/say.txt"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.next();
            if(line.equals("over")){
                break;
            }
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }
}
