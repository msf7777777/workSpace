package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 1.定义一个成员变量dataSource
 * 2.定义一个public的静态方法,提供一个连接池
 * 3.定义一个静态的方法 ,提供一个Connection
 */
public class C3P0Utils {
    // 1.定义一个成员变量dataSource
    private static final DataSource dataSource = new ComboPooledDataSource();

    //2.定义一个public的静态方法,提供一个连接池
    public static DataSource  getDataSource(){
        return dataSource;
    }

    //3.定义一个静态的方法 ,提供一个Connection
    public static Connection  getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
