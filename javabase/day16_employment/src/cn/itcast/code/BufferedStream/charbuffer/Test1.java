package cn.itcast.code.BufferedStream.charbuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
    大家,键盘录入若干个字符串数据, 保存到当前模块中a.txt文件中,直接输入"over"时结束
    换行符:
        window: \r\n
        mac : \r
        linux: \n
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //1.创建输出流关联本模块下的a.txt
       // FileWriter fw = new FileWriter("day01/a.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("day01/a.txt"));
        //2.不断的接受键盘录入的数据
        while (true){
            String data = scanner.next();
            //将数据保存, 但是"over"是结束的标记
            if(data.equals( "over")){
                break;
            }
            bw.write(data);
            //写一句换一行
            bw.newLine();// 跟据操作系统写换行符

        }
        //3.关闭资源
        bw.close();

    }
}
