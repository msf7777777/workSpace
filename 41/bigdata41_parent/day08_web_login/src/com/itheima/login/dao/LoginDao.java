package com.itheima.login.dao;

import com.itheima.login.utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public Boolean login(String username, String password) throws Exception {

        //1. 获取连接
        Connection connection = C3P0Utils.getConnection();
        //2. 根据连接获取语句执行平台
        String sql  = "select  * from user where username = ? and password = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        //3. 执行SQL  获取结果
        //3.1: 先对 ? 设置值
        statement.setString(1,username);
        statement.setString(2,password);

        //3.2: 执行SQL
        ResultSet resultSet = statement.executeQuery();

        //4. 处理结果集
        boolean FLAG = resultSet.next(); // 如果有下一行, 说明查询到了内容, 说明登录成功, 返回true, 否则返回false

        //5. 释放资源
        C3P0Utils.closeAll(resultSet,statement,connection);

        return FLAG;
    }
}
