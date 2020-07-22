package cn.itcast.code.下午.demo;

public class Test01 {

    public static void main(String[] args) {
        // 四位数对称数 ---> 1221 ---->
        for (int i = 1000; i < 10000; i++) {
            //求各位...
            String s = i +"";
            if(s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)){
                System.out.println(i);
            }
        }


    }
}
