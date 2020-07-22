package com.itheima.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    //转入
    public void transferIn(@Param("inName") String inName, @Param("money") double money);

    //转出
    public void transferOut(@Param("outName") String outName, @Param("money") double money);
}
