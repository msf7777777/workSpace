package com.itheima.jdbcTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbcTemplateDemo2 {
    /**
     * jdbc.driver=com.mysql.jdbc.Driver
     * jdbc.url=jdbc:mysql://localhost:3306/test
     * jdbc.username=root
     * jdbc.password=root
     */

    @Test
    public void testInsert() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update("INSERT INTO `stu` VALUES(?,?,?,?)","7", "麻少飞", "天津国土资源和房屋职业学院", "7777777");
    }

    @Test
    public void testInsert2() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update("INSERT INTO `stu` VALUES(?,?,?,?)","520", "麻少飞love张嘉敏", "Me大学", "949494");
    }


}
