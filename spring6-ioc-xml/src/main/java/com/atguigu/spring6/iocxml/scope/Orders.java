package com.atguigu.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 11:12
 */
public class Orders {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println(orders1);
    }
}
