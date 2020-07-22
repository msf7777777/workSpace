package cn.itcast.code.extends1.test07;
/*
子类构造第一行, 默认会调用父类的空参构造!!!!!!!!
        你不写, 系统会帮你加上去.
        系统咋就这么爱你呢???? 他闲着没事给你加这个玩意干什么?????
        答:
            因为子类随时可以使用父类的相关内容, 父类的成员一定要初始化好
            子类才可以使用!!!!, 所以子类构造执行的时候, 一定会先走父类构造,来初始化父类的内容
        */
public class Test01 {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("梅军建");
    }
}
