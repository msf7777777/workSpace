package cn.itcast.code.packageclass;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);// 这个发生事情??? ---->自动装箱
        // 将元素变成原来的2倍
        for (int i = 0; i < al.size(); i++) {
            Integer integer = al.get(i);
            ;// integer = integer * 2
            al.set(i, integer *= 2);
        }



       /* //求出集合中的所有元素和
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            Integer integer = al.get(i);
            sum += integer;// 自动拆箱的操作
        }
        System.out.println(sum);*/


    }

    private static void demo1() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(new Integer(10));
        al.add(new Integer(20));
        al.add(new Integer(30));
        al.add(new Integer(40));
        // 希望将 集合中的数据变成原来的2倍
        for (int i = 0; i < al.size(); i++) {
            Integer integer = al.get(i);
            //希望将这个值*2 ----> 拆箱
            int i1 = integer.intValue() * 2;
            //将结果在设置获取 ---->因为集合中只能存储引用数据类型,还得装箱
            Integer integer1 = new Integer(i1);
            al.set(i, integer1);


        }
    }
}
