package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import cn.itcast.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class UserDaoImpl implements UserDao {
    @Override
    public User queryUserByUsernameAndPassword(User user) throws Exception {
        // 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 书写sql
        String sql = "select * from tb_user where username=? and password=?";
        // 执行sql
        return qr.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
    }
}
