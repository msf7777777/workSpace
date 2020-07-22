package cn.itcast.stringbuilder;

public class Test2 {

    public static void main(String[] args) {
        //1.无参构造创键StringBuilder
        StringBuilder sb = new StringBuilder();
        //2.追加信息 ----> 类似于 += 但是好在什么地方
        sb.append("abc");
        sb.append("bcd");
        sb.append("ddd");
        sb.append("eee");
        sb.append("fff");
        System.out.println(sb);

    }
}
