package cn.itcast.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        // 目标: 读取 words.txt 文件中的内容, 放到集合中
        List<String> wordList = new ArrayList<String>();

        InputStream in = Demo01.class.getClassLoader().getResourceAsStream("words.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while((line=br.readLine())!=null) {
                wordList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(wordList);

    }
}
