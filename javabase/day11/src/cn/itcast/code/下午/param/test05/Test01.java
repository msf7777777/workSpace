package cn.itcast.code.下午.param.test05;

public class Test01 {

    public static void main(String[] args) {
        GrilFriend grilFriend = new GrilFriend("林青霞",18);
        BoyFreind boyFreind = new BoyFreind("梅军建",18,grilFriend);
        //boyFreind.shopping(grilFriend);
        boyFreind.shopping();
        boyFreind.shopping();
        GrilFriend grilFriend1 = new GrilFriend("黎姿",18);
        boyFreind.shopping(grilFriend1);
        boyFreind.shopping(grilFriend);
    }
}
