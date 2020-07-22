package com.itheima.jdbcTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean3.xml")
public class jdbcTemplateDemo1 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // 添加一条学生信息
    @Test
    public void testInsert() {

        jdbcTemplate.update("INSERT INTO `stu` VALUES(?,?,?,?)","77", "麻志强", "天津大学", "7");

    }

    // 修改第一条学生信息
    @Test
    public void testUpdate() {

        jdbcTemplate.update("update `stu` SET sname=?, schoolName=?, score=? WHERE sid=666;", "小麻", "忻州五中", "1");

    }

    // 删除第七条学生信息
    @Test
    public void testDelete() {

        jdbcTemplate.update("DELETE FROM `stu` WHERE sid=?;", "7");

    }
}
