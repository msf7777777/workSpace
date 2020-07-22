package cn.itcast.code.collection;

import java.util.*;

public class Test5 {

    public static void main(String[] args) {
        //1.随机10个不重复的放到数组中
        int[] arr = new int[10];
        Random r = new Random();
        int index = 0;
        while (index !=10){
            int number = r.nextInt(100) + 1;
            //判断number是否在数组中存在
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == number){
                    count++;
                    break;
                }
            }
            if(count == 0){//证明不存在
                arr[index] = number;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        //2.将奇数的元素放到一个新的容器中(使用集合)
        Collection<Integer> collection = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                //将元素添加到集合中即可
                collection.add(arr[i]);
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
