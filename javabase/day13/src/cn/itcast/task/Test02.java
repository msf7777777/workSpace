package cn.itcast.task;

import java.util.HashMap;

/*
2.有以下字符串：
	String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
	请编程统计每个字符出现的次数
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        //创建集合收纳 字符Character 和 字符出现次数Integer
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }else{
                int a = 0;//消除波浪线用
                hm.put(c, 1);
            }
        }
        System.out.println(hm);

    }
}
