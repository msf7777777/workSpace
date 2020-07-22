package cn.itcast.a_jdbc;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {
    // 目标: 查询用户表的所有数据
    @Test //查
    public void demo01() throws Exception {
        //1. 注册驱动.
        Class.forName("com.mysql.jdbc.Driver");

        //2. 获得并建立连接.
        String url = "jdbc:mysql://localhost:3306/day03";
        //String url = "jdbc:mysql://127.0.0.1:3306/day03";//这个也行
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        //3. 获得执行sql语句的对象
        String sql = "select * from msf";
        PreparedStatement statement = connection.prepareStatement(sql);

        //4. 执行sql语句，并返回结果
        ResultSet resultSet = statement.executeQuery();

        //5. 处理结果
        System.out.println("【demo01】");
        while (resultSet.next()) {
            int uid = resultSet.getInt("uid");
            String uname = resultSet.getString("username");
            String upwd = resultSet.getString("password");
            String nickname = resultSet.getString("nickname");

            System.out.println("ID: " + uid + " 名字: " + uname + " 密码: " + upwd + " 昵称: " + nickname);
        }
        //6. 释放资源.
        connection.close();
        statement.close();
        resultSet.close();
    }

    @Test //类名访问
    public void demo02() throws ClassNotFoundException {
        Class.forName("cn.itcast.a_jdbc.User");
    }

    @Test //对象访问
    public void demo03() {
        User user = new User();
    }

    // 需求: 根据用户名和密码查询用户数据
    @Test
    public void demo04() throws Exception {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        //1. 注册驱动.
        Class.forName(driverClassName);

        //2. 获得连接.
        connection = DriverManager.getConnection(url, username, password);

        //3. 获得执行sql语句的对象
        String sql = "select * from msf where username = ? and password = ? and nickname = ?";
        preparedStatement = connection.prepareStatement(sql);
        //  如果有? , 就需要输入值
        preparedStatement.setString(1, "msf");
        preparedStatement.setInt(2, 901113);
        preparedStatement.setString(3, "麻少飞");


        //4. 执行sql语句，并返回结果
        resultSet = preparedStatement.executeQuery();

        //5. 处理结果
        if (resultSet.next()) {
            int uid = resultSet.getInt("uid");
            String umane = resultSet.getString("username");
            String nickname = resultSet.getString("nickname");

            System.out.println("【demo04】");
            System.out.println("ID: " + uid + " 名字: " + umane + " 昵称: " + nickname);
            System.out.println("恭喜你,登录成功");
        } else {
            System.out.println("fuck off");
            System.out.println("用户名或密码错误!");
        }

        //6. 释放资源.
        connection.close();
        preparedStatement.close();
        resultSet.close();
    }

    // 需求2: 插入一条sql语句
    @Test
    public void demo05() throws Exception {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        // 1 注册驱动
        Class.forName(driverClassName);

        // 2 获取连接
        conn = DriverManager.getConnection(url, username, password);

        // 3 获取执行sql的对象
        String sql = "insert into msf(uid, username, password, nickname) values(null, ?, ?, ?);";
        stmt = conn.prepareStatement(sql);
        //   设置参数
        stmt.setString(1, "zjb");
        stmt.setInt(2, 961223);
        stmt.setString(3, "周嘉碧");

        // 4 执行sql 获取结果
        int count = stmt.executeUpdate();

        // 5 处理结果
        System.out.println("【demo05】");
        System.out.println("影响条数: " + count);

        // 6 释放资源
        conn.close();
        stmt.close();
        rs.close();
    }

    // 需求3: 修改
    @Test
    public void demo06() throws Exception {
        // update tb_user set username=?, nickname=? where uid = ?
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;

        // 1 注册驱动
        Class.forName(driverClassName);
        // 2 获取连接
        conn = DriverManager.getConnection(url, username, password);
        // 3 获取执行sql的对象
        String sql = "update msf set username=?, nickname=? where uid = ?";
        stmt = conn.prepareStatement(sql);
        // 3.1 设置参数
        stmt.setString(1, "zjb");
        stmt.setString(2, "周庆长");
        stmt.setInt(3, 4);

        // 4 执行sql 获取结果
        int count = stmt.executeUpdate();

        // 5 处理结果
        System.out.println("【demo06】");
        System.out.println("修改影响条数: " + count);

        // 6 释放资源
        stmt.close();
        conn.close();
    }

    // 需求4: 删除
    @Test
    public void demo07() throws Exception {
        // delete from tb_user where uid=?
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/day03";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;

        // 1 注册驱动
        Class.forName(driverClassName);

        // 2 获取连接
        conn = DriverManager.getConnection(url, username, password);

        // 3 获取执行sql的对象
        String sql = "delete from msf where uid=?";
        stmt = conn.prepareStatement(sql);

        // 3.1 设置参数
        stmt.setInt(1, 5);

        // 4 执行sql 获取结果
        int count = stmt.executeUpdate();

        // 5 处理结果
        System.out.println("【demo07】");
        System.out.println("删除 影响的条数:" + count);

        // 6 释放资源
        stmt.close();
        conn.close();
    }

    //System.out.println("【demo04】");
    @Test
    public void demo08() throws IOException {
        // 回顾 Properties对象 作用: 读取外部的 xxxx.properties文件内容
        // 注意事项: 文件 必须 放到src目录下
        // 1 创建对象
        Properties props = new Properties();

        // 2 建立 对象和配置文件的关系
        InputStream in = JDBCTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        props.load(in);

        // 3 读取
        String driverClassName = props.getProperty("driverClassName");
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }
}