package cn.itcast.b_aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    public void zhuanzhang(String inUser, String outUser, int money) {
        // 加钱
        accountDao.in(inUser, money);
//        int j = 1/0;
        // 减钱
        accountDao.out(outUser, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
