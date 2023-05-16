package com.atguigu.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 16:49
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user" ,User.class);
        System.out.println(user);
    }
}
