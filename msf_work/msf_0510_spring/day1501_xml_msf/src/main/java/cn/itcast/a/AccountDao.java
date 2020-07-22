package cn.itcast.a;

public class AccountDao {

    //客户充值
    public void in(String inUser, int outMoney) {
        System.out.println(inUser + " 【充值】：" + outMoney + " $ 成功");
    }

    //商家收款
    public void out(String outUser, int inMoney) {
        System.out.println(outUser + " 【收款】：" + inMoney + " $ 成功");
    }
}
