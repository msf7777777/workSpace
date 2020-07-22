package cn.itcast.string.exchange;
/*
        String toLowerCase()  ---> 将字符串变成小写
		String toUpperCase()  ---> 将字符串变成大写
 */
public class Test1 {

    public static void main(String[] args) {
        //字符串是不可改变的序列, 一旦发生改变一定产生一个新字符串
        String string = "abc";
        string =  string.toUpperCase();
        System.out.println(string);
    }
}
