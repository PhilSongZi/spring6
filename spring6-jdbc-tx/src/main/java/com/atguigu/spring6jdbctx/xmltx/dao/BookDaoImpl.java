package com.atguigu.spring6jdbctx.xmltx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
@Repository
public class BookDaoImpl implements BookDao {
    /**
     * dao 实现
     */

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 更新用户的余额 -图书价格
    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql, price, userId);
    }

    // 更新图书的库存 -1
    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";
        jdbcTemplate.update(sql, bookId);
    }

    // 根据Id查询图书价格
    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }
}
