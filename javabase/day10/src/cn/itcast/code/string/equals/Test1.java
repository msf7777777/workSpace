package cn.itcast.string.equals;
/*
    字符串比较方法
        boolean equals(Object obj); ---> 和另外一个字符串比较,每一个字符都要一样
        boolean equalsIgnoreCase(String src); ---> 忽略大小写比较
 */
public class Test1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "ABC";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2));
        System.out.println(s1== s3);//false
        System.out.println(s1.equals( s3));//false
        boolean b = s1.equalsIgnoreCase(s3);
        System.out.println(b);//?忽略大小写比较


    }
}
