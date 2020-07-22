package cn.itcast.a;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class Dao {

    //氪金
    public void beFuck(String kid, int kidMoney) {
        System.out.println(kid + " 氪金：" + kidMoney);
    }

    //敛财
    public void fucker(String mrMa, int mrMaMoney) {
        System.out.println(mrMa + " 敛财：" + mrMaMoney);
    }
}
