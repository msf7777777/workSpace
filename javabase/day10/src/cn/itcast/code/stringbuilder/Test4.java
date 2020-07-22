package cn.itcast.stringbuilder;
/*
    总结:
        StringBuilder的reverse方法很方便帮助我们反转字符串
 */
public class Test4 {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("abc");
        builder.reverse();
        System.out.println(builder);
    }
}
