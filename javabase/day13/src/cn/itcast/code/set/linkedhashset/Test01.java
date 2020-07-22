package cn.itcast.code.set.linkedhashset;

import java.util.LinkedHashSet;
/*
        LinkedHashSet 和HashSet用法完全一模一样, 但是可以保证有序
 */
public class Test01 {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("林青霞");
        set.add("林青霞");
        set.add("王祖贤");
        set.add("豆腐妹");

        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }



    }
}
