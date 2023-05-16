package com.atguigu.spring6.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 10:05
 */
public class TestStu {

    @Test
    public void testStu() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diref.xml");
        Student stu = context.getBean("studentp", Student.class);
        stu.run();
    }

//    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean-diref.xml");
//        Student stu = context.getBean("student", Student.class);
//        stu.run();
//    }
}
