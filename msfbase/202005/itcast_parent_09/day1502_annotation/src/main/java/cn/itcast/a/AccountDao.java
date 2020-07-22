package cn.itcast.a;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 将dao交给spring容器管理
// <bean id="accountDao" class="cn.itcast.a.AccountDao"/>
@Repository("accountDao")
public class AccountDao {
    // 加钱
    public void in(String inUser, int money) {
        System.out.println(inUser + " 加钱 " + money + " 元");
    }

    // 减钱
    public void out(String outUser, int money) {
        System.out.println(outUser + " 减钱 " + money + " 元");
    }
}
