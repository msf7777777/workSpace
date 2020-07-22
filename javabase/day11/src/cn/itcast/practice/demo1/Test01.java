package cn.itcast.practice.demo1;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            String s = i + "";
            if(s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2)){
                System.out.println(i);
            }
        }
    }
}
