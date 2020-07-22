package cn.itcast;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {

        // 1、加载数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2、创建并获取数据库链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis01", "root", "123456");
        // 3、sql语句
        String sql = "select * from user where username=?";
        // 4、创建jdbc statement对象
        PreparedStatement ps = connection.prepareStatement(sql);
        // 5、设置sql语句中的参数(使用preparedStatement)
        ps.setString(1,"王五");
        // 6、通过statement执行sql并获取结果
        ResultSet resultSet = ps.executeQuery();
        // 7、对sql执行结果进行解析处理
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String username = resultSet.getString("username");
            String birthday = resultSet.getString(3);
            String sex = resultSet.getString("sex");

            System.out.println(id+":"+username+":"+birthday+":"+sex);
        }
        // 8、释放资源(resultSet、preparedstatement、connection)
        resultSet.close();
        ps.close();
        connection.close();
    }
}
