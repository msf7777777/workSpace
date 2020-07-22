package cn.itcast.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    //收款
    public void in(@Param("name") String  inAccount, @Param("money") int money);

    //充值
    public void out(@Param("name") String  outAccount, @Param("money") int money);
}
