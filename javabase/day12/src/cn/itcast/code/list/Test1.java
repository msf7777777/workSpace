package cn.itcast.code.list;

import java.util.ArrayList;
import java.util.List;

/*
    - `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
- `public E get(int index)`:返回集合中指定位置的元素。
- `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
- `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元
 */
public class Test1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//`public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
        list.add("林青霞");
        list.add("王祖贤");
        list.add(0,"梅军建");
        //- `public E get(int index)`:返回集合中指定位置的元素。
        //String remove = list.remove(10);
        //System.out.println(list);
        //public E get(int index)`:返回集合中指定位置的元素。
       // String s = list.get(0);
        //System.out.println(s);
        //public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元
        //将王祖贤修改成"豆腐妹"
       // String str = list.set(2, "豆腐妹");//将被修改的那个元素返回
        //System.out.println(str);
        //System.out.println(list);
        //使用普通for遍历list集合

        for (int i = 0; i < list.size(); i++) {
            //通过集合的get方法来获取每一个元素
            String s = list.get(i);
            System.out.println(s);
        }


    }
}
