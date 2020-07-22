package cn.itcast.code.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();
        // String[] arr = new String[10]
        //使用add方法添加元素
        collection.add("abc");
        collection.add("bcd");
        collection.add("aaa");
//        collection.add(1);
//        collection.add(2);
//        collection.add(3);
        // 集合的泛型限定集合中存储的数据类型, 这个东西只能规定成引用数据类型
        //如果我们规定, 则jvm帮我们确定成Object


    }
}
