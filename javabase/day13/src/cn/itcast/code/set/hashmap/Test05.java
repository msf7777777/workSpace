package cn.itcast.code.set.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
    `public boolean containKey(Object key)`:判断该集合中是否有此键。
 */
public class Test05 {
    //键盘录入一个字符串, 请统计, 每个字符串出现的次数
    public static void main(String[] args) {
        // asdfdsafsrgasgfdregfasfdsaf中国
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.next();
        //创建一个Map集合来装载字符和次数的对应关系
        HashMap<Character, Integer> hm = new HashMap<>();
        //1.遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (hm.containsKey(c)) {// 该字符串已经存在
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
            //判断该字符是否在集合中存在
            /*Integer integer = hm.get(c);
            if(integer == null){//证明该字符第一次出现
                hm.put(c, 1);
            }else{//证明该字符不是第一次, 我们需要将其值+1
                //然后在存放进去
                hm.put(c, ++integer);
            }*/
        }
        System.out.println(hm);

        //Map<Character,Integer>
    }
}
