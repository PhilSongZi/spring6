package com.atguigu.spring6.iocxml.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 11:41
 */
public class TestUser {

    @Test
    public void testUser() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6.bean对象创建完成。可以使用了");
        System.out.println(user);
        // 销毁
        context.close();
    }
}
