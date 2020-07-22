package cn.itcast.servcie.impl;

import cn.itcast.mapper.AccountMapper;
import cn.itcast.servcie.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public AccountServiceImpl() {
        System.out.println("============================调用 AccountServiceImpl 的构造方法.... ...");
    }

    /**
     * @Transactional 代表给当前方法增加事务
     */
    @Override
    @Transactional
    public void zhuanzhang(String outAccount, String inAccount, int money) {
        // 出账
        accountMapper.out(outAccount, money);

        // int j = 1/0;

        // 入账
        accountMapper.in(inAccount, money);

    }
}
