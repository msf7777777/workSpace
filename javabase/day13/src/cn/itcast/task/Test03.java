package cn.itcast.task;

import java.util.HashSet;
import java.util.Set;

/*
3.ArrayList有以下元素: "a","f","b","c","a","d"，
请用任意方式完成集合元素去重。去除集合中重复的元素。
 */
public class Test03 {
    public static void main(String[] args) {
        //利用Set集合不能重复完成集合元素去重
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('f');
        set.add('b');
        set.add('c');
        set.add('a');
        set.add('d');
        System.out.println(set);
    }
}
