package cn.itcast.task;

import java.util.LinkedHashSet;

/*
7 题目
	请按以下要求顺序编码：
	定义一个可以存储“整数”的LinkedHashSet对象
	存储以下整数
		20,30,50,10,30,20
	打印集合大小。为什么跟存入的数量不一致？
	使用增强for遍历集合，打印大于25的元素
 */
public class Test07 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> number = new LinkedHashSet<>();
        number.add(20);
        number.add(30);
        number.add(50);
        number.add(10);
        number.add(30);
        number.add(20);
        System.out.println("打印集合大小");
        System.out.println(number.size());
        System.out.println("为什么跟存入的数量不一致？");
        System.out.println("集合中不能存储相同的元素,体现了:");
        System.out.println("HashSet 无序 无索引 无重复的特性");
        System.out.println("使用增强for遍历集合，打印大于25的元素");
        for (Integer it : number) {
            if(it > 25){
                System.out.println(it);
            }
        }
    }
}
