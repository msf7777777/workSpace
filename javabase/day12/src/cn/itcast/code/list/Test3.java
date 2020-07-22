package cn.itcast.code.list;

import java.util.LinkedList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("林青霞");
        list.add(0,"梅军建");
        //list.addFirst("梅军建");
       // String s = list.removeFirst();
        String s = list.remove(0);
        System.out.println(s);

        System.out.println(list);
    }
}
