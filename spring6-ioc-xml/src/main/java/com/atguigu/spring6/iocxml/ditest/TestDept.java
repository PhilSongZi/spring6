package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 20:44
 */
public class TestDept {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-dilist.xml");
        // 员工对象
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();
    }
}
