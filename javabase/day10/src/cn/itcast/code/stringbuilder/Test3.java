package cn.itcast.stringbuilder;

public class Test3 {
    public static void main(String[] args) {
        //使用字符串拼接 1到1000000的数字
      /*  String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);*/

        StringBuilder sb = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
        System.out.println(sb);

    }
}
