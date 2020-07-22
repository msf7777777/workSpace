package cn.itcast.code.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        //1.键盘录入若干字符串,直到录入"over"时停止录入
        Scanner scanner = new Scanner(System.in);
        Collection<String> con = new ArrayList<>();//{"ab","bc","cd","123","adsfdsaf"}
        while(true){
            System.out.println("请录入字符串");
            String next = scanner.next();
            if(next.equals("over")){
                //结束循环
                break;
            }
            //将录入的数据保存到集合中, 但是有一个不是元素"over"
            con.add(next);
        }
        //2. 将集合中长度 <3的元素删除
        //2.1遍历集合,拿到每一个元素
        Iterator<String> it = con.iterator();// new Itr();
        //2.2判断元素长度是否<3,如果小于3则删除
        while (it.hasNext()){
            String str = it.next();//"ab"
            if(str.length() < 3){
                //将其移除
                //con.remove(str);//迭代器遍历集合的时候,采用集合的方法对集合进行了增删
                it.remove();
            }
        }
        //3.查看集合
        System.out.println(con);

    }
}
