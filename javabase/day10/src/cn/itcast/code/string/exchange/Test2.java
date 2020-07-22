package cn.itcast.string.exchange;
/*
public String replace(CharSequence target,CharSequence replacement)
 */
public class Test2 {

    public static void main(String[] args) {

        String s = "谢霆锋好帅, 谢霆锋好酷, 谢霆锋好高";
        //将s中所有的谢霆锋改成"梅军建";
        s = s.replace("谢霆锋", "梅军建");
        System.out.println(s);

    }
}
