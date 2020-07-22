package cn.itcast.service.impl;

import cn.itcast.mapper.AccountMapper;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountMapper")
    private AccountMapper accountMapper;

    public AccountServiceImpl() {
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
        System.out.println("〓〓〓〓〓〓〓调用 AccountServiceImpl 的构造方法〓〓〓〓〓〓〓");
        System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");

    }

    /**
     *
     * @Transactional 代表给当前方法增加事务
     */
    @Override
    @Transactional
    public void zhuanzhang(String inAccount, String outAccount, int money) {

        //收款
        accountMapper.in(inAccount, money);

//        int a = 1/0;

        //充值
        accountMapper.out(outAccount, money);
    }
}
