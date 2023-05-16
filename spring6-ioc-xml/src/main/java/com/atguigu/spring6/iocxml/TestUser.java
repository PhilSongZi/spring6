package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 15:46
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");

        // 1.根据 id 获取 bean
        User user = (User) context.getBean("user");
        System.out.println("1.根据ID获取bean：" + user);

        // 2.根据类型获取bean
        User user2 = context.getBean(User.class);
        System.out.println("2.根据类型获取bean:" + user2);

        // 3.根据id和类型获取bean‘
        User user3 = context.getBean("user", User.class);
        System.out.println("3.根据id和类型获取bean:" + user3);
    }
}
