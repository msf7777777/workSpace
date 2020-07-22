package cn.itcast.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

/*
8.随机10个不重复的1-100的整数存入集合,
  分别使用ArrayList和HashSet集合实现.观察以下问题, 思考Set集合是否可以完成?
  将元素的奇数放左边 ,偶数放右边.最后总结Set对比List集合的缺点在何处?
 */
public class Test08 {
    public static void main(String[] args) {
        Collection<Integer> coll = new LinkedList<>();
        Random random = new Random();
        while (coll.size() < 10){
            int number = random.nextInt(100) + 1;
            int count = 0;
            for (Integer it : coll) {
                if(it == number){
                    count++;
                    break;
                }
            }
            if(count == 0){
                if(number % 2 == 1){
                    ((LinkedList<Integer>) coll).addFirst(number);
                }else{
                    ((LinkedList<Integer>) coll).addLast(number);
                }
            }
        }
        for (Integer it2 : coll) {
            System.out.print(" " + it2);
        }
        System.out.println("HashSet特性无序,无法实现有序放置元素");
    }
}
