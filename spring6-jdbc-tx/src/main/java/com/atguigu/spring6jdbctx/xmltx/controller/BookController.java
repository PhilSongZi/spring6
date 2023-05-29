package com.atguigu.spring6jdbctx.xmltx.controller;

import com.atguigu.spring6jdbctx.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
@Controller
public class BookController {
    /**
     * controller 注入service对象，调用service提供的服务。
     */

    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId) {
        bookService.buyBook(bookId, userId);
    }
}
