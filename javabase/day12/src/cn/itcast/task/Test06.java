package cn.itcast.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
6.1-100随机生成10个不重复的数组放入集合, 实现奇数放左边,偶数放右边
 */
public class Test06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        Iterator<Integer> it = list.iterator();
        int countSide = 0;
        while(countSide != 10 && it.hasNext()){
            Integer listInteger = (r.nextInt(100) + 1);
            int count = 0;
//            Integer integer1 = it.next();
            for (int i = 0; i < countSide + 1; i++) {
                if (listInteger.equals(listInteger)){
                    count++;
                    break;
                }
            }
            if(count == 0){
                list.add(listInteger);
                countSide++;
            }
        }
        System.out.println(list);
    }
}
