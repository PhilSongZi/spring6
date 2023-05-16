package com.atguigu.spring6.iocxml.auto;

import com.atguigu.spring6.iocxml.auto.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 15:51
 */
public class TestUser {

    @Test
    public void testUser() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
