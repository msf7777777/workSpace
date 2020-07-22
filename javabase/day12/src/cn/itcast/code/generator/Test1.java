package cn.itcast.code.generator;


import java.util.ArrayList;
import java.util.Collection;

public class Test1 {

    public static void main(String[] args) {
        Collection con  = new ArrayList();

        con.add(1);
        con.add(2);
        con.add("aaa");
        con.add("bbb");

        for (Object o : con) {
            //确定不能使用子类特有的方法
            String s = (String) o;
            if(s.length() == 3){
                System.out.println(s);
            }
        }


    }
}
