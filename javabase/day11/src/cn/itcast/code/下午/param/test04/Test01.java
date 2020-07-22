package cn.itcast.code.下午.param.test04;

public class Test01 {
    /*
        引用数据类型作为成员变量
     */
    public static void main(String[] args) {
        Computer computer = new Computer("i7", 1000, 6999, "Thinkpad");
        Person person = new Person("梅军建", 18,computer );
    }
}
