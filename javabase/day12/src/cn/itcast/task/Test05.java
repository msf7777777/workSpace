package cn.itcast.task;

import cn.itcast.code.generator.selfgenerator.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
5.键盘录入若干的字符串存入集合中,直到录入"over"结束, 请完成以下需求
	(1)将集合中所有元素变成大写
	(2)将集合以"张"开头的元素打印出来
	(3)将元素所有"A"变成"B",最后展示数据元素
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("请录入若干的字符串存入集合中,直到录入 over 结束");
        while(true){
            String str = scanner.next();
            if (str.equals("over") == true){
                break;
            }
            list.add(str);
        }
        //1.将集合中所有元素变成大写
        Iterator<String> iterator = list.iterator();
        int count = 0;
        while(iterator.hasNext()){
            list.set(count, iterator.next().toUpperCase());
            count++;
        }
        System.out.println("将集合中所有元素变成大写: ");
        System.out.println(list);
        //2.将集合以"张"开头的元素打印出来
        Iterator<String> iterator2 = list.iterator();
        System.out.println("集合以 张 开头的元素打印出来: ");
        while(iterator2.hasNext()){
            String str = iterator2.next();
            if (str.startsWith("张")){
                System.out.print(str + " ");
            }
        }
        System.out.println();

        //3.将元素所有"A"变成"B",最后展示数据元素
        Iterator<String> iterator3 = list.iterator();
        System.out.println("将元素所有 A 变成 B : ");
        while(iterator3.hasNext()){
            System.out.println(iterator3.next().replace('A', 'B'));
        }
    }
}
