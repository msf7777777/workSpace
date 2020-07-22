package cn.itcast.utils;

import cn.itcast.DruidTest;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DruidUtils {
    private static DataSource ds;

    static {
        try {
            // 2.1 创建连接池
            Properties props = new Properties();
            InputStream in = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
            props.load(in);
            ds = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 1 获取连接
    public static Connection getConnection() throws Exception {
        return ds.getConnection();
    }

    // 2 获取连接池(数据源), 为后期的框架做准备
    public static DataSource getDataSource() {
        return ds;
    }
}
