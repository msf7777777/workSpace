package cn.itcast.string.exchange;

public class Test3 {

    public static void main(String[] args) {
        String s = "谢霆锋好帅, 谢霆锋谢霆锋谢霆锋谢霆锋谢霆锋好酷, 谢霆锋好高";
        //求谢霆锋出现了多少次????
        // 1. 求出原来的长度
        int length1 = s.length();
        //2. 将s中所有的谢霆锋都改成"",在计算一次长度
        String newStr = s.replace("谢霆锋", "");
        int length2 = newStr.length();
        //3.(将原来的长度 - 现在的长度 )/ 3 得到个数
        int result = (length1 - length2) / 3;
        System.out.println(result);
    }
}
