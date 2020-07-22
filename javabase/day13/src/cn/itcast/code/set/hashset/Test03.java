package cn.itcast.code.set.hashset;

import java.util.HashSet;
/*
    自定义对象, 如果想要属性一样, 就认为是相同的元素, 必须重写hashcode和equals方法
 */
public class Test03 {

    public static void main(String[] args) {
        Student student1 = new Student("林青霞", 18);
        Student student2 = new Student("林青霞", 18);

        HashSet<Student> hs = new HashSet<>();
        hs.add(student1);
        hs.add(student2);
        System.out.println(hs.size());

    }
}
