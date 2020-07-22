package cn.itcast.string.select;
/*
    int length(); --->得到字符串中字符的个数
    char charAt(int index); --->得到指定位置上的字符
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "abcdefg";
        // 使用charAt传入0索引, 得到0索引的字符
        char c = s.charAt(0);
        System.out.println(c);
        char c1 = s.charAt(1);
        System.out.println(c1);
        // 我想取出所有的字符
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        
    }
}
