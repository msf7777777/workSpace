package cn.itcast.code.set.hashmap;

import java.util.HashMap;

/*
    HashMap中的键其实就是一个HashSet,底层也是Hash表结构, 想要保证元素唯一,
    需要重写hashcode以及equals方法才行
 */
public class Test02 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("梅军建",18), "小帅哥");
        hm.put(new Student("梅军建",18), "小帅帅");
        System.out.println(hm);
    }
}
