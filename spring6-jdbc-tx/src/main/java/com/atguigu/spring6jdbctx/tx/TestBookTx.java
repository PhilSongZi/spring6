package com.atguigu.spring6jdbctx.tx;

import com.atguigu.spring6jdbctx.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 测试类。
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        /**
         * 1. 测试买书方法。用户1 购买id1 的书。测试成功。
         * 2. 添加上 service层的 buyBook方法加上@Transactional注解后测试，测试成功。
         * 3. 测试一次买多本书
         */
//        bookController.buyBook(1, 1);
        Integer[] bookIds = {1, 2};
        bookController.checkout(bookIds, 1);
    }
}
