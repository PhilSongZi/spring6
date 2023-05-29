package com.atguigu.spring6jdbctx.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {

    @Autowired      // 注意与 @Resource 的区别理解（最好用后者）（Autowired 一时爽，查bug火葬场）
    private JdbcTemplate jdbcTemplate;

    // 添加 修改 删除
    @Test
    public void testUpdate() {
//        // 1.添加操作
//        // 编写SQL语句
//        String sql = "INSERT INTO t_emp VALUES (NULL,?,?,?)";
//        // 调用jdbcTemplate的方法
//        int rows = jdbcTemplate.update(sql, "林平之", 30, "未知");
//        System.out.println(rows);

//        // 2.修改
//        String sql = "UPDATE t_emp SET name=? WHERE id=?";
//        int rows = jdbcTemplate.update(sql, "林平之134556", 3);
//        System.out.println(rows);

        // 3.删除
        String sql = "DELETE FROM t_emp WHERE id=?";
        int rows = jdbcTemplate.update(sql,  3);
        System.out.println(rows);
    }

    // 查询：返回对象
    @Test
    public void testSelectObject() {
//        String sql = "select * from t_emp where id=?";
//        // java8的固定写法，先学一学
//        Emp empResult = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setId(rs.getInt("id"));
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }, 2);
//        System.out.println(empResult);
        // 写法二：直接用Mapper
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

    // 查询：返回list集合
    @Test
    public void testSelectList() {
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }
    // 查询：返回单个值
    @Test
    public void testSelectValue() {
        String sql = "select count(*) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
