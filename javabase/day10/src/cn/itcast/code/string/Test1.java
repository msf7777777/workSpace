package cn.itcast.code.string;

/*
    1.字符串对象的创建
        构造:
            * public String()

    解释: 创建一个空白字符串对象, 不包含任何内容.

* public String(String s)

   解释: 把字符串数据封装成字符串对象.

* public String(char[] value)

  解释: 把字符数组的数据封装成字符串对象.

* public String(char[]  value, int index, int count)

   解释: 把字符数组的一部分数据封装成字符串对象.

* public String(byte[] bys)

   解释: 把字节数组的数据封装成字符串对象.

* public String(byte[] bys, int index, int count)

   解释: 把字节数组的一部分数据封装成字符串对象.
 */
public class Test1 {

    public static void main(String[] args) {
        String s = new String(); //使用空参构造得到字符串对象
        System.out.println(s);
        String s1 = new String("abc");//使用有参构造,将另外一个字符串的内容包含进来
        System.out.println(s1);
        char[] arr = {'a', 'b', 'c'};
        String s2 = new String(arr); // 将字符数组变成字符串
        System.out.println(s2);
        String s3 = new String(arr, 0, 2);//将字符数组的一部分转成字符串
        System.out.println(s3);
        byte[] arr1 = {97, 98, 99};
        String s4 = new String(arr1); //将字节数组转成字符串
        System.out.println(s4);
        String s5 = new String(arr1,0, 2); //将字节数组的一部分转成字符串
        System.out.println(s5);
        String s6 = "abc"; //直接将字符串常量赋值给字符串类型最受欢迎的写法!!!!!!

    }
}
