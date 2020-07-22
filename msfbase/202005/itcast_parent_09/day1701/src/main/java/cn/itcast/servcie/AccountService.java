package cn.itcast.servcie;

public interface AccountService {

    // 转账
    public void zhuanzhang(String outAccount, String inAccount, int money);
}
