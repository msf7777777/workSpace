package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import cn.itcast.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> queryAll() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from user";
        return qr.query(sql, new BeanListHandler<User>(User.class));
    }
}
