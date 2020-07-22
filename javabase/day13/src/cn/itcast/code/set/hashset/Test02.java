package cn.itcast.code.set.hashset;

import java.util.HashSet;
import java.util.Set;
/*
    Set它是如何去重的
    总结: 底层比较的是hashcode和equals方法, 只有当这两个条件
    都一样的时候, 才认为是重复的元素

 */
public class Test02 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("林青霞");
        set.add("林青霞");
        set.add("重地");
        set.add("通话");


        System.out.println(set.size());
    }
}
