package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 11:55
 */
public class TestUser {

    private Person person;

    // 创建logger对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        //加载spring配置文件，对象创建
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        //获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println("1:" + user);

        //使用对象调用方法进行测试
        System.out.print("2:");
        user.add();

        // 手动写日志
        logger.info("执行调用成功...");
    }

    // 反射创建对象
    @Test
    public void testUserObject1() {
        // 获取类class对象
        Class clazz = null;
        try {
            clazz = Class.forName("com.atguigu.spring6.User");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 调用方法创建对象
        // Object o = clazz.newInstance();
        User user = null;
        try {
            user = (User) clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(user);
    }
}
