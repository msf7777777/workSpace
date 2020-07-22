package cn.itcast.string.is;
/*

        public boolean equals(Object obj) ---> 判断一个字符串和另外一个字符串是否相同
		boolean contains(CharSequence s) ---> 判断一个字符串手否包含另外一个字符串
		boolean endsWith(String suffix)  ---> 判断字符串是否以某个字符串结尾
		boolean startsWith(String prefix) ----> 判断字符串是否以某个字符串开头
 */
public class Test1 {
    public static void main(String[] args) {
        //boolean contains(CharSequence s) ---> 判断一个字符串手否包含另外一个字符串

        String s = "我爱林青霞";
        boolean flag = s.contains("青我霞");
        System.out.println(flag);
        //boolean endsWith(String suffix)  ---> 判断字符串是否以某个字符串结尾
        String s1 = "我和林青霞不得不说的故事.txt";
        boolean flag1 = s1.endsWith(".mp3");
       // boolean startsWith(String prefix) ----> 判断字符串是否以某个字符串开头
        System.out.println(flag1);
        String s2 = "张翠山";
        System.out.println(s2.startsWith("张"));



    }
}
