package cn.itcast.task.test05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
5 题目
	请编写main()方法，按以下要求顺序,定义一个Set集合，并存储以下数据：
	刘备，关羽，张飞，刘备，张飞
	打印集合大小
	使用迭代器遍历集合，并打印每个元素
	使用增强for遍历集合，并打印每个元素
 */
public class Test05 {
    public static void main(String[] args) {
        Set<String> man = new HashSet<>();
        man.add("刘备");
        man.add("关羽");
        man.add("张飞");
        man.add("刘备");
        man.add("张飞");
        //1.打印集合大小
        System.out.println("打印集合大小");
        System.out.println(man.size());
        //2.使用迭代器遍历集合，并打印每个元素
        Iterator it = man.iterator();
        System.out.println("使用迭代器遍历集合，并打印每个元素");
        while(it.hasNext()){
            String name = (String) it.next();
            System.out.println(name);
        }
        //3.使用增强for遍历集合，并打印每个元素
        System.out.println("使用增强for遍历集合，并打印每个元素");
        for (String name : man) {
            System.out.println(name);
        }
    }
}
