package cn.itcast.a;

public class AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void jiaoyi(String inUser, String outUser, int outMoney, int inMoney) {

        //用户充值
        accountDao.in(inUser, outMoney);

        //商家收款
        accountDao.out(outUser, inMoney);
    }
}
