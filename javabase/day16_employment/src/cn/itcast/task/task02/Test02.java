package cn.itcast.task.task02;

import java.io.*;

/*
第二题:
	将dpcq.txt以一次读一行的方式展示到控制台上
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1.先写几行
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day01/dpcq.txt"));
        bufferedWriter.write("麻少飞");
        bufferedWriter.newLine();
        bufferedWriter.write("29岁");
        bufferedWriter.newLine();
        bufferedWriter.write("张嘉敏");
        bufferedWriter.newLine();
        bufferedWriter.write("23岁");
        bufferedWriter.close();

        //2.将dpcq.txt以一次读一行的方式展示到控制台上
        BufferedReader bufferedReader = new BufferedReader(new FileReader("day01/dpcq.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
