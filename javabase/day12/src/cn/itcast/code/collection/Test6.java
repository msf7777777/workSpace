package cn.itcast.code.collection;

import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        //1.随机10个不重复数字的放到集合中
        Random random = new Random();
        Collection<Integer> cl = new ArrayList<>();
        while(cl.size() != 10){
            int number = random.nextInt(100) + 1;
            //判断number是否在集合中存在
            if(!cl.contains(number)){//不存在
                cl.add(number);
            }
        }

        //2.将奇数的元素放到一个新的容器中(使用集合)
        Collection<Integer> collection = new ArrayList();
        Iterator<Integer> it = cl.iterator();
        while (it.hasNext()){
            Integer number = it.next();
            if(number % 2 == 1){
                collection.add(number);
            }
        }
        //3.遍历下集合
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
