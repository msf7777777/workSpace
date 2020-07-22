package cn.itcast.code.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {

    public static void main(String[] args) {
        //ArrayList实现了 Collection和Iterable的规则
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        Iterator<String> it = collection.iterator();
        //使用Iterator的对象来帮助我们遍历集合
        // hasNext : 判断是否还有数据未取出
        //next: 取出当前元素
        while (it.hasNext()){
            System.out.println(it.next().toUpperCase()+ it.next().toLowerCase());
        }
        /*
            注意事项:
                hasNext只能判断是否有下一个!!!!!一次hasNext配一次next
                不能一次hasNext配多个next,否则会出现错误数据
         */
        /*if(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        if(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        if(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        if(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }*/

        //我们不能肆无忌惮的取, 因为如果没有元素的话, 会报错!!!!!!
        //要先判断再去取,这样避免错误
    }
}
