package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import cn.itcast.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(User user) throws Exception {
        // 操作数据库 添加一条记录
        // 1 创建queryRunner对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2书写sql语句
        String sql = "insert into tb_user(id, username, password, nickname) values(null, ?, ?, ?)";
        // 3 执行
        Object[] paramArr = {user.getUsername(), user.getPassword(), user.getNickname()};
        qr.update(sql, paramArr);
    }
}
