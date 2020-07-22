package cn.itcast.string.sub;
/*
    String[] split(String regex) ---> 将字符串按照某种规则进行切割成若干份, 将若干份的字符串装到字符串数组返回
		String substring(int beginIndex)----> 从某个位置开始截取到最后
		String substring(int beginIndex, int endIndex) --->从某个位置开始截取到指定位置,含头不含尾[beginIndex,endIndex)
 */
public class Test1 {

    public static void main(String[] args) {
        //String substring(int beginIndex)----> 从某个位置开始截取到最后
        String s = "abcdefg";
        // 字符串是一个不可改变的序列, 但凡发生改变一定产生一个新的字符串
        String newStr = s.substring(5);
        System.out.println(s);
        System.out.println(newStr);
       // String substring(int beginIndex, int endIndex) --->从某个位置开始截取到指定位置,
        // 含头不含尾[beginIndex,endIndex)
        String newStr1 = s.substring(2, 4);
        System.out.println(s);
        System.out.println(newStr1);

    }
}
