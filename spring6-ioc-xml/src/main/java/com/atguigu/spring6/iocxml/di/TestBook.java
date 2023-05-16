package com.atguigu.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 17:12
 */
public class TestBook {
    @Test
    public void testSetter() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testConstructor() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book1 = context.getBean("bookCon", Book.class);
        System.out.println(book1);
    }
}
