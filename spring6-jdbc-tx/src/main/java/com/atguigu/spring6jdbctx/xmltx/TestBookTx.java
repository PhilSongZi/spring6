package com.atguigu.spring6jdbctx.xmltx;

import com.atguigu.spring6jdbctx.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 测试类。基于xml实现的。
 */
@SpringJUnitConfig(locations = "classpath:bean-xml.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        /**
         *  测试买书方法。用户1 购买id1 的书。
         */
        bookController.buyBook(1, 1);
    }
}
