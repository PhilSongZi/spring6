package com.atguigu.spring6jdbctx.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description
 */

@Service
public class CheckoutServiceImpl implements CheckoutService{

    @Autowired
    private BookService bookService;

    // 一次购买多本书
    @Override
    @Transactional
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}
