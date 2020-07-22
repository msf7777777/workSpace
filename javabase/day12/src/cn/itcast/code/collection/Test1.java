package cn.itcast.code.collection;

import cn.itcast.task.homework.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    /*
        - `public boolean add(E e)`：  把给定的对象添加到当前集合中 。(掌握)
        - `public void clear()` :清空集合中所有的元素。
        - `public boolean remove(E e)`: 把给定的对象在当前集合中删除。(掌握)
        - `public boolean contains(Object obj)`: 判断当前集合中是否包含给定的对象。(掌握)
        - `public boolean isEmpty()`: 判断当前集合是否为空。
        - `public int size()`: 返回集合中元素的个数。(掌握)
        - `public Object[] toArray()`: 把集合中的元素，存储到数组中
     */
    public static void main(String[] args) {
        //得到Collection的对象, 采用多态(多态不能使用子类特有方法)
        Collection collection = new ArrayList();// Collection只提供了增删功能
        //他是一个容器, 是一个类, 我们围绕着他的增删改查来去学习
        // - `public boolean add(Object e)`：  把给定的对象添加到当前集合中 。
        collection.add("梅军建");
        collection.add("林青霞");
        collection.add(1);//自动装箱了 Integer
        collection.add(1);//自动装箱了 Integer
        collection.add(2);//自动装箱了
        collection.add(new Student());
        //直接打印collection, 相当于调用了其toString
        System.out.println(collection);
        //- `public Object[] toArray()`: 把集合中的元素，
        // 存储到数组中,很少用,集合的功能比数组强大, 所以很少有这样的需求
        //Object[] objects = collection.toArray();
        //System.out.println(objects.length);


        //- `public int size()`: 返回集合中元素的个数。
       // System.out.println(collection.size());




        //collection.clear();
        //- `public boolean isEmpty()`: 判断当前集合是否有元素
        //System.out.println(collection.isEmpty());




        /*
            - `public boolean contains(Object obj)`: 判断当前集合中是否包含给定的对象。
            注意:他是拿着所有元素和判断的元素对比equals方法只要有一个满足,则返回true
            全部不满足才返回false
         */
       // boolean contains = collection.contains(new String("梅军建"));
        //boolean contains = collection.contains(new Student());
        //System.out.println(contains);



        //- `public void clear()` :清空集合中所有的元素。要慎用
        //collection.clear();
        /*
            - `public boolean remove(Object e)`: 把给定的对象在当前集合中删除
            注意: 1.根据元素删除, 其实底层会将所有元素和要删除的元素对比equals方法
                  2.只会移除第一个满足条件的元素
         */
        //collection.remove(new String("梅军建"));
        //collection.remove(new Student());
       // collection.remove(1);

    }
}
