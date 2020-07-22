package cn.itcast.task.task03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
第三题:
	键盘录入若干句话,直到录入"over"时结束录入, 请将录入的内容保存到文件中
 */
public class Test03 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day01/麻少飞.txt"));
        System.out.println("输入几行东西,直到输入 over 结束");
        while (true){
            String some = scanner.next();
            if("over".equals(some)){
                System.out.println("");//消除波浪线
                break;
            }
            bufferedWriter.write(some);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
