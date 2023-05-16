package com.atguigu.spring6;

import com.atguigu.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:16
 */
public class TestUserController {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean(UserController.class);
        userController.add();
    }
}
