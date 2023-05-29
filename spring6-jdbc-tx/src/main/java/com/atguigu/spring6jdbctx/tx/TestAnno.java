package com.atguigu.spring6jdbctx.tx;

import com.atguigu.spring6jdbctx.tx.config.SpringConfig;
import com.atguigu.spring6jdbctx.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description
 */
public class TestAnno {

    @Test
    public void testTxAllAnnotation() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = applicationContext.getBean("bookController", BookController.class);
        Integer[] bookIds = {1, 2};
        accountService.checkout(bookIds, 1);
    }
}
