package cn.itcast.code.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    演示Set集合的常见功能
    特点:
        大部分无序, 没有索引, 不能重复
        没有特殊的方法, 所有的方法都是继承Collection
    总结:
        Set常见方法
            add(E e); 添加一个元素
            remove(Object o) 删除元素
            contains(Object o) 判断是否包含某个元素
            size(); 求元素个数
         遍历set集合

     注意:
        Set集合没有索引的, 所以没有获取和修改的方法

 */
public class Test01 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // add
        set.add("林青霞");
        set.add("林青霞");
        set.add("王祖贤");
        set.add("豆腐妹");


        //remove
        set.remove("豆腐妹");

        // contains
        boolean flag = set.contains(new String("林青霞"));
        System.out.println(flag);
        // size
        System.out.println(set.size());
        //遍历 ---> 通过迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        //System.out.println(set);
    }
}
