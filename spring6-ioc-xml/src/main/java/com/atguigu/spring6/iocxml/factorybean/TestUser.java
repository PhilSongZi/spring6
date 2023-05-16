package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 15:22
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
