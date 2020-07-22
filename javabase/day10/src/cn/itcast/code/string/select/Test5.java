package cn.itcast.string.select;
/*
 int indexOf(String str)(掌握)  ----> 查找一个字符串在另外一个字符串中的第一次出现的位置,从0开始查
int indexOf(String str, int fromIndex)
					----> 查找一个字符串在另外一个字符串中的第一次出现的位置,从某个开始查

int lastIndexOf(String str) ---> 查询一个字符串在另外一个字符串中最后出现的位置
 */
public class Test5 {

    public static void main(String[] args) {
        String s = "梅军建是一个帅哥, 帅哥是梅军建";
//        int location = s.indexOf("帅哥");
//        System.out.println(location);
//        int location1 = s.indexOf("帅哥", 7);
//        System.out.println(location1);
        int location = s.lastIndexOf("帅哥");
        System.out.println(location);


    }
}
