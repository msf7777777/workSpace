package cn.itcast.task;

import java.util.*;

/*
4. 键盘录入若干的数字存入集合中, 直到录入 -1 结束,完成以下需求
    (1)求集合中最大值
	(2)求集合中元素和
	(3)将集合中偶数元素变成的二倍
	(4)删除集合所有奇数的元素
	(注意,单独解决每一个需求)
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> col = new ArrayList();
        System.out.println("请录入若干的数字, 直到录入 -1 结束");
        while(true){
            Integer it = scanner.nextInt();
            if(it == -1){
                break;
            }
            col.add(it);
        }
        System.out.println(col);

        //1.求集合中最大值
        Iterator<Integer> it = col.iterator();
        int max = 0;
        while(it.hasNext()){
            Integer integer = it.next();
            if(integer > max){
                max = (int)integer;
            }
        }
        System.out.println("集合中最大值是: " + max);

        //2.求集合中元素和
        Iterator<Integer> it2 = col.iterator();
        int num = 0;
        while(it2.hasNext()){
            Integer integer = it2.next();
            num = integer + num;
        }
        System.out.println("集合中元素和是: " + num);
        //3.将集合中偶数元素变成的二倍
        Iterator<Integer> it3 = col.iterator();
        int count = 0;
        while(it3.hasNext()){
            int i = it3.next();
            if (i % 2 == 0){
                col.set(count, i * 2);
            }
            count++;
        }
        System.out.println("集合中偶数元素变成的二倍" + col);
        //4.删除集合所有奇数的元素
        Iterator<Integer> it4 = col.iterator();
        for (int i = 0; i < col.size(); i++) {
            Integer integer = col.get(i);
            if (integer % 2 == 1){
                col.remove(i);
                i--;
            }
        }
        System.out.println("删除集合所有奇数的元素" + col);
    }
}
