package cn.itcast.a;

public class AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    // 转账
    public void zhuanzhang(String inUser, String outUser, int money) {
        // 加钱
        accountDao.in(inUser, money);

//        int j = 1/0;

        // 减钱
        accountDao.out(outUser, money);
    }
}
