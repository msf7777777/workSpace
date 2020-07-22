package cn.itcast.task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
10. 基于第9题, 生成两个数组, 将数组的交集部分打印到控制台上.
 */
public class task10_teacher {
    public static void main(String[] args) {
        //1.调用getArray(),得到一个数组
        int[] arr1 = getArray();//0x001
        int[] arr2 = getArray();//0x002
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //{1,2,3,56,76,87} {2,5,1,4,6}
        for (int i = 0; i < arr1.length; i++) {
            int number = arr1[i];//取出第一个数组中的每一个元素
            //去和第二个数组所有元素做对比
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j] == number){
                    System.out.print(number + " ");
                }
            }
        }
    }
    public static int[] getArray(){ // 数组的整体的类型是:  数据类型[]
        //1.定义数组装10个随机数
        int[] arr = new int[10];
        //2.不断产生随机数
        Random random = new Random();
        //定义变量来去记录我们存放到何处了
        int index = 0;
        //随机次数是不确定的
        while (index != arr.length){
            int number = random.nextInt(10) + 1;
            //拿到随机数, 先放? 先判断?
            //查一个元素在另外一个容器中存不存在单的问题 ---->利用计数器思想
            //1.定义计数器,来统计这个数出现的次数
            int count = 0;
            //2.遍历容器, 去和这个元素对比, 如果相同则计数器++
            for (int i = 0; i < index; i++) {
                if(arr[i] == number){
                    count++;
                    break;
                }
            }
            //3.循环完毕后, 判断count的大小
            if(count == 0){//证明number不存在, 则可以存放
                arr[index] = number;
                index++; //放一个,索引往后移动一位
            }
        }

        // 遍历数组, 验证我们的操作
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }*/
        // return  int[] arr; 典型错误写法, 需要返回的数组类型的地址
        return  arr;
    }
}
