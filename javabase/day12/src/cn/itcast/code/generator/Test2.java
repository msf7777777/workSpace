package cn.itcast.code.generator;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {

    public static void main(String[] args) {
        Collection con = new ArrayList();
        con.add("aaa");
        con.add("aaa");
        con.add("aaa");
        con.add("aaa");
        con.add("aaa");

        for (Object o : con) {
            String s = (String) o;
            System.out.println(s);
        }
    }
}
