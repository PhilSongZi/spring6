package com.atguigu.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 16:10
 */
public class TestUserDao {

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        // 根绝类型获取接口对应bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}
