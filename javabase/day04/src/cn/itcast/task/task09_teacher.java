package cn.itcast.task;

import java.util.Random;

public class task09_teacher {
    public static void main(String[] args) {
        //1.定义数组装10个随机数
        int[] arr = new int[10];
        //2.不断产生随机数
        Random random = new Random();
        //定义变量来去记录我们存放到何处了
        int index = 0;
        //随机次数是不确定的
        while (true){
            int number = random.nextInt(100) + 1;
            //拿到随机数, 先放? 先判断?
            //查一个元素在另外一个容器中存不存在单的问题 ---->利用计数器思想
            //1.定义计数器,来统计这个数出现的次数
            int count = 0;
            //2.遍历容器, 去和这个元素对比, 如果相同则计数器++
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == number){
                    count++;
                    break;
                }
            }
            //3.循环完毕后, 判断count的大小
            if(count == 0){//证明number不存在, 则可以存放
                arr[index] = number;
                index++; //放一个,索引往后移动一位
                if(index == arr.length){//等index到最后一位的停止循环
                    break;
                }
            }
        }

        // 遍历数组, 验证我们的操作
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}
