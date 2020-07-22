package cn.itcast.uitls;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Utils {

    // 连接池
    private static ComboPooledDataSource cpds = new ComboPooledDataSource();

    // 1. 获取连接
    public static Connection getConnection() throws SQLException {
        // 2.2 从连接池中获取连接
        return cpds.getConnection();
    }

    // 2. 获取连接池
    public static DataSource getDataSource() {
        return cpds;
    }
}
