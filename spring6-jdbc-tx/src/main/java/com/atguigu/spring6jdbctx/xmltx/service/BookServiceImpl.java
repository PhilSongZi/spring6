package com.atguigu.spring6jdbctx.xmltx.service;

import com.atguigu.spring6jdbctx.xmltx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
//@Transactional加到类上影响整个类
@Service
public class BookServiceImpl implements BookService {
    /**
     * service注入对象dao，调用dao的方法操作数据表
     */

    @Autowired
    private BookDao bookDao;

    // @Transactional加到方法上只影响这一个方法
    // 一些属性：只读、超时（超时时间段内未完成则抛出异常回滚）、回滚策略、隔离级别、传播行为（事务方法之间调用，事务如何使用）
    @Override
    public void buyBook(Integer bookId, Integer userId) {

        // 根据Id查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书的库存 -1
        bookDao.updateStock(bookId);
        // 更新用户的余额 -图书价格
        bookDao.updateBalance(userId, price);
    }
}
