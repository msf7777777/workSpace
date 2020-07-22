package cn.itcast.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 本质上说, 将目标类交给spring管理
 * 将service交给spring管理
 *     <bean id="accountService" class="cn.itcast.a.AccountService">
 *         <!--设置属性-->
 *         <property name="accountDao" ref="accountDao1"/>
 *     </bean>
 */
@Service("accountService")
public class AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;


    // 转账
    public void zhuanzhang(String inUser, String outUser, int money) {
        // 加钱
        accountDao.in(inUser, money);

//        int j = 1/0;

        // 减钱
        accountDao.out(outUser, money);
    }
}
