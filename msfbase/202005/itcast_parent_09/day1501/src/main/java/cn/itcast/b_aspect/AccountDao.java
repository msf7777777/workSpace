package cn.itcast.b_aspect;

public class AccountDao {

    // 减钱
    public void in(String inUser, int money) {
        System.out.println(inUser + " 加钱 " + money + " 元!");
    }

    // 加钱
    public void out(String outUser, int money) {
        System.out.println(outUser + " 减钱 " + money + " 元!");
    }
}
