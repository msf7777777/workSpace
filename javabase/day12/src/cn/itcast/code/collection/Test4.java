package cn.itcast.code.collection;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    如何遍历Collection集合
 */
public class Test4 {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //1.想办法获取集合的iterator的对象, 我们知道这个是Iterable的规则
        Iterator<String> iterator = collection.iterator();
        //2.使用iterator对象的hasNext和next方法来帮助我们遍历
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("进行操作");
        }


    }
}
