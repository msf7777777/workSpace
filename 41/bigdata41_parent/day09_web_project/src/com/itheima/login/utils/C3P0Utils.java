package com.itheima.login.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C3P0Utils {

    private C3P0Utils() {
    }
    private static ComboPooledDataSource dataSource= new ComboPooledDataSource();

    /*static {
        dataSource = new ComboPooledDataSource();
    }*/

    // 获取连接的方法
    public static Connection getConnection(){

        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  connection;
    }

    //2. 释放资源的方法
    @SuppressWarnings("all")
    public static void closeAll(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }


            if (statement != null) {
                statement.close();
            }


            if(connection!=null){

                connection.close(); // 归还连接
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
