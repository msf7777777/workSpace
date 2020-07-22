package cn.itcast.code.BufferedStream.charbuffer;

import java.io.*;
import java.util.*;

public class Test3 {

    public static void main(String[] args) throws IOException {
        //1.一次读一行将内容读出来 ----> BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("day01/b.txt"));
        //2.不断的读取
        String line;
        //3.创建Map集合
        HashMap<Integer,String> map = new HashMap<>();
        while((line = br.readLine())!=null){
            // 得到每一行数据, 将其序号得到,
            //1.可以查第一个点的位置
            int location = line.indexOf(".");
            //2.截取.前面的东西 ---> [0, location- 1]
            String number = line.substring(0, location);
            //3.将String类型的number变成int类型, 因为int可以排序
            int num = Integer.parseInt(number);
            //4.将序号和内存保存到map集合中
            map.put(num, line);
        }
        //4.关闭流
        br.close();
        //5.需要将map中的数据保存到文件中 ---->
        BufferedWriter bw = new BufferedWriter(new FileWriter("day01/c.txt"));
        //6.遍历map集合
        Set<Integer> keys = map.keySet();//键有可能是没有排序好的 ---> Collections.sort(List list)
        List<Integer> ids = new ArrayList<>(keys);
        Collections.sort(ids);//对ids里面的序号进行排序
        for (Integer id : ids) {
            String content = map.get(id);
            bw.write(content);
            //换一行
            bw.newLine();
        }

        //这个是有bug的, Hash表结构没有任何排序的功能!!!!!
        /*for (Integer key : keys) {
            String content = map.get(key);
            bw.write(content);
            //换一行
            bw.newLine();
        }*/
        //7.关闭资源
        bw.close();
    }
}
