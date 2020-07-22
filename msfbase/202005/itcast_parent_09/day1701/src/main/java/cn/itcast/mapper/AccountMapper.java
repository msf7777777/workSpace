package cn.itcast.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    // 减钱(出账)
    public void out(@Param("name") String outAccount, @Param("money") int money);


    // 加钱(入账)
    public void in(@Param("name") String inAccount, @Param("money") int money);
}
