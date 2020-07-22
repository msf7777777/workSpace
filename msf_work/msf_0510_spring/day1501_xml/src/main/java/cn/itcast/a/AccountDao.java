package cn.itcast.a;

public class AccountDao {
    //价钱
    public void in(String inUser, int money) {
        System.out.println(inUser + " 充值： " + money + " 元");
    }

    //减钱
    public void out(String outUser, int money) {
        System.out.println(outUser + " 扣费： " + money + " 元");
    }
}
