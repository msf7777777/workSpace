package cn.itcast.task;

import java.util.ArrayList;
import java.util.Collection;

/*
2.题目
	请定义一个Collection类型的集合，存储以下分数信息：
		88.5,39.2,77.1,56.8,89,99,59.5
	请编程实现以下功能：
 使用增强for遍历所有元素，并打印
 使用增强for遍历所有元素，打印不及格的分数；
 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
 使用增强for遍历所有元素，求出最高分，并打印；
	(注意：以上所有功能写在一个main()方法中，但请单独实现)
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList();
        col.add(88);col.add(5);col.add(39);col.add(2);
        col.add(77);col.add(1);col.add(56);col.add(8);
        col.add(99);col.add(59);col.add(5);
        //1.使用增强for遍历所有元素，并打印
        for (Integer it : col) {
            System.out.print(it + " ");
        }
        System.out.println();
        //2.使用增强for遍历所有元素，打印不及格的分数；
        for (Integer it : col) {
            if(it < 60){
                System.out.print(it + " ");
            }
        }
        System.out.println();
        //3.使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        int count = 0;
        double num = 0;
        for (Integer it : col) {
            if(it < 60){
                count++;
                num = (double)(it + num);
            }
        }
        System.out.println("不及格分数的数量是: " + count);
        System.out.println("不及格分数的平均分是: " + (num / count));
        //4.使用增强for遍历所有元素，求出最高分，并打印；
        int max = 0;
        for (Integer it : col) {
            if(it > max){
                max = it;
            }
        }
        System.out.println("最高分为: " + max);
    }
}
