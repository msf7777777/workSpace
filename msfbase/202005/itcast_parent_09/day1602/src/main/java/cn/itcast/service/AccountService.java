package cn.itcast.service;


import cn.itcast.dao.AccountDao;
import org.springframework.transaction.annotation.Transactional;

public class AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    // 转账
    // 需要增强的方法

    /**
     * 建立 增强类 和 目标类需要增强方法 的关系
     */
    @Transactional
    public void zhuanzhang(String outAccount, String inAccount, int money) {
        // 出账
        accountDao.out(outAccount, money);

//        int j = 1/0;

        // 入账
        accountDao.in(inAccount, money);
    }
}
