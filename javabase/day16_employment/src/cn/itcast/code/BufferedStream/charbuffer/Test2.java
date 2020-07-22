package cn.itcast.code.BufferedStream.charbuffer;

import java.io.*;

public class Test2 {
    //将a.txt内存一行一行的展示到控制台上 --->BufferedReader

    public static void main(String[] args) throws IOException {
        //1.使用BufferedReader关联我们的a.txt
        BufferedReader br  = new BufferedReader(new FileReader("day01/a.txt"));
        /*while(true){
            String s = br.readLine();
            if(s == null){
                break;//s如果==null证明读到了末尾
            }
            System.out.print(s);
        }*/
        String line; //用来记录每一行数据
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        //2.关闭资源
        br.close();
    }
}
