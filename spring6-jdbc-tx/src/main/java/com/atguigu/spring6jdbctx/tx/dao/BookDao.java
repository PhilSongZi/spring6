package com.atguigu.spring6jdbctx.tx.dao;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
public interface BookDao {
    // 更新用户的余额 -图书价格
    void updateBalance(Integer userId, Integer price);

    // 更新图书的库存 -1
    void updateStock(Integer bookId);

    // 根据Id查询图书价格
    Integer getPriceByBookId(Integer bookId);
}
