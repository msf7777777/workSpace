package cn.itcast.code.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test8 {
    /*
        增强for:
            格式:
            for(元素数据类型 变量名 : 数组|集合){
            }
        注意事项:
            增强for底层是使用的迭代器, 我们不能使用集合的方法对其进行增删操作,否则
             报并发修改异常
     */
    public static void main(String[] args) {
        Collection<String> con = new ArrayList<>();
        con.add("aaa");
        con.add("bbb");
        con.add("ccc");



        for(String s : con){
            if(s.length() <= 3){
                con.remove(s);// 增强for底层采用的是迭代器, 不能使用集合方法进行增删
            }
        }
        /*int[] arr = {1,2,3,4};
        for (int i : arr){
            System.out.println(i);
        }*/

    }
}
