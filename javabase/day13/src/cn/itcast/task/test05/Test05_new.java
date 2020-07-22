package cn.itcast.task.test05;

import java.util.HashSet;
import java.util.Set;
/*
5 题目
	请编写main()方法，按以下要求顺序,定义一个Set集合，并存储以下数据：
	刘备，关羽，张飞，刘备，张飞
	打印集合大小
	使用迭代器遍历集合，并打印每个元素
	使用增强for遍历集合，并打印每个元素
 */
public class Test05_new {
    public static void main(String[] args) {
        Set<People> man = new HashSet<>();
        man.add(new People("刘备"));
        man.add(new People("关羽"));
        man.add(new People("张飞"));
        man.add(new People("刘备"));
        man.add(new People("张飞"));
        System.out.println(man);
    }
}
