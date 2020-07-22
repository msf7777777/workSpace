package cn.itcast.b_dbutils;

import cn.itcast.pojo.Product;
import cn.itcast.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.util.List;

public class DbutilsDEmo {
    @Test
    public void demo01() throws Exception {
        // 需求: 删除
        // 1 创建执行sql的对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql语句
        String sql = "delete from product where pid = ?";
        // 3 执行
        int count = qr.update(sql, 13);

        System.out.println("删除影响的条数: " + count);
    }

    // spring框架 ioc 动态代理: jdk动态代理和cglib动态代理
    // conn.close(); 连接池通过动态代理改造了这个方法, 将连接还给了连接池

    @Test
    public void demo02() throws Exception {
        // 需求: 修改
        // update product set pname=?, price=? where pid=?
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql
        String sql = "update product set pname=?, price=? where pid=? ";
        // 3 执行
        qr.update(sql, "华为p40pro", 5000, 7);
    }

    @Test
    public void demo0202() throws Exception {
        // 需求: 修改
        // update product set pname=?, price=? where pid=?
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql
        String sql = "update product set pname=?, price=? where pid=? ";
        // 3 执行
        Object[] paramArr = {"小米10", 4299, 10};
        qr.update(sql, paramArr);
    }

    @Test
    public void demo03() throws Exception {
        // 需求: 增加
        // insert into product(pid, pname, price, category_id) values(?, ?, ?, ?)
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql
        String sql = "insert into product(pid, pname, price, category_id) values(?, ?, ?, ?)";
        // 3 执行
        Object[] paramArr = {13, "奔驰S200", 204299, "c003"};
        qr.update(sql, paramArr);
    }

    @Test
    public void demo04() throws Exception {
        // 需求: 将查询的结果封装到 product对象中, BeanHandler
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql语句
        String sql = "select * from product where pid=?";
        // 3 执行sql, 获取结果
        Product product = qr.query(sql, new BeanHandler<Product>(Product.class), 13);
        System.out.println(product);
    }

    @Test
    public void demo05() throws Exception {
        // 目标: BeanListHandler : 先将每行数据封装到java对象中, 在把java对象放到集合中返回
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql
        String sql = "select * from product";
        // 3 执行sql iter遍历集合的快捷
        List<Product> productList = qr.query(sql, new BeanListHandler<Product>(Product.class));
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Test
    public void demo06() throws Exception {
        // 目标: ScalarHander 用来返回 记录数
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql
        String sql = "select count(1) from product";
        // 3 执行sql
        Long count = qr.query(sql, new ScalarHandler<Long>());

        System.out.println(count);
    }

    @Test
    public void demo07() throws Exception {
        // 需求: ColumnListHandler  将指定列的值放到集合中返回
        // 1 创建对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        // 2 书写sql
        String sql = "select * from product";
        // 3 执行sql
        List<String> pnameList = qr.query(sql, new ColumnListHandler<String>("pname"));

        for (String pname : pnameList) {
            System.out.println(pname);
        }
    }

    @Test
    public void demo08() {

    }

    @Test
    public void demo09() {

    }

    @Test
    public void demo10() {

    }
}
