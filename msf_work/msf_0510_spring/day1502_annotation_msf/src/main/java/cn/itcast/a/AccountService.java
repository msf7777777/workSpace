package cn.itcast.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    public void jiaoyi(String inUser, String outUser, int outMoney, int inMoney) {

        //用户充值
        accountDao.in(inUser, outMoney);

        //异常代码
//        int 麻少飞 = 1/0;

        //商家收款
        accountDao.out(outUser, inMoney);
    }
}
