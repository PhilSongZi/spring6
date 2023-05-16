package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 17:55
 */
public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diarray.xml");
        // 员工对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();
    }
}
