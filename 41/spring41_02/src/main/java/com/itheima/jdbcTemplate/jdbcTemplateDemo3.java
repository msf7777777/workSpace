package com.itheima.jdbcTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean3.xml")
public class jdbcTemplateDemo3 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 1. 根据根据id查询学生name
     * 2. 查询一共有多少个学生数
     * 3. 查询id为7 的student对象,返回Student
     * 4. 查询id为8的student对象返回map
     * 5. 查询所有的student对象 返回List<Map<String ,Object>>  queryForList
     * 6. 如果只想查询结果放到List<Bean>  query
     */

    // 1. 根据根据id查询学生name
    @Test
    public void testFindById() {

        String name = jdbcTemplate.queryForObject("select sname from stu where sid=6", String.class);
        System.out.println("〓〓〓〓〓〓〓【" + name + "】〓〓〓〓〓〓〓");

    }
    @Test
    public void testFindById2() {

        String name = jdbcTemplate.queryForObject("select sname from stu where sid=?", String.class, 7);
        System.out.println("〓〓〓〓〓〓〓【" + name + "】〓〓〓〓〓〓〓");

    }

    // 2. 查询一共有多少个学生数
    @Test
    public void testCount() {

        Integer count = jdbcTemplate.queryForObject("select count(1) from stu", Integer.class);
        System.out.println("〓〓〓〓〓〓〓【" + count + "】〓〓〓〓〓〓〓");

    }

    // 3. 查询id为7 的student对象,返回Student
    @Test
    public void testQueryStuById() {

        BeanPropertyRowMapper<Student> mapper = new BeanPropertyRowMapper(Student.class);
        Student student = jdbcTemplate.queryForObject("select * from stu where sid=?",mapper,6);
        System.out.println("〓〓〓〓〓〓〓【" + student + "】〓〓〓〓〓〓〓");

    }

    @Test
    public void testQueryStuById2() {

        Student student = jdbcTemplate.queryForObject("select * from `stu` where sid=?",
                new BeanPropertyRowMapper<Student>(Student.class),6);
        System.out.println("〓〓〓〓〓〓〓【" + student + "】〓〓〓〓〓〓〓");

    }

    // 4. 查询id为8的student对象返回map
    @Test
    public void testQueryStuMapById() {

        Map<String, Object> map = jdbcTemplate.queryForMap("select * from `stu` where sid=?", 7);
        System.out.println("〓〓〓〓〓〓〓【" + map + "】〓〓〓〓〓〓〓");

    }

    // 5. 查询所有的student对象 返回List<Map<String ,Object>>  queryForLis// 6. 如果只想查询结果放到List<Bean>  query
    @Test
    public void testQueryAllStuMap() {

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from `stu` where sid=?", 520);
        System.out.println("〓〓〓〓〓〓〓【" + maps + "】〓〓〓〓〓〓〓");

    }
    @Test
    public void testQueryAllStuMap2() {

        List<Map<String, Object>> maps2 = jdbcTemplate.queryForList("select * from `stu`");
        System.out.println("〓〓〓〓〓〓〓【" + maps2 + "】〓〓〓〓〓〓〓");

    }

    // 6. 如果只想查询结果放到List<Bean>  query
    @Test
    public void testQueryAllStu() {

        List<Student> list = jdbcTemplate.query("select * from stu", new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("〓〓〓〓〓〓〓【" + list + "】〓〓〓〓〓〓〓");

    }
}
