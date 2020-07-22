package cn.itcast.code.extends1.test06;
/*
    子类构造第一行, 默认会调用父类的空参构造!!!!!!!!
    你不写, 系统会帮你加上去.
    系统咋就这么爱你呢???? 他闲着没事给你加这个玩意干什么?????
 */
public class Test1 {

    public static void main(String[] args) {
        //Zi zi = new Zi();
        Zi zi1 = new Zi(10);
        //Zi zi2 = new Zi(10,20);
    }
}
