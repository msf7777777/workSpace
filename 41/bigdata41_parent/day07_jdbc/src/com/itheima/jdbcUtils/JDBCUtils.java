package com.itheima.jdbcUtils;

import java.sql.*;

public class JDBCUtils {
    private static String driverClass;
    private static String url;
    private static String user;
    private static String password;

    private JDBCUtils() { // 构造私有化
    }

    static {
        //1. 注册驱动
        try {
            // 能不能搞一个外部的配置文件?  properties 对象 读取数据 赋值 操作
            driverClass = "com.mysql.jdbc.Driver";
            url = "jdbc:mysql:///day07_web";
            user = "root";
            password = "123456";

            Class.forName(driverClass);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //1. 获取连接的方法
    public static Connection getConnection() { // 每一次获取一个新的连接对象
        Connection connection = null;
        try {
            //2. 获取连接
            connection  = DriverManager
                    .getConnection(
                            url, user, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }


    //2. 释放资源的方法

    public static void closeAll(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }


            if (statement != null) {
                statement.close();
            }


            if(connection!=null){

                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
