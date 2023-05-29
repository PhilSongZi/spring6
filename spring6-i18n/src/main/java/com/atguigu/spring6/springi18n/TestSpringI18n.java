package com.atguigu.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description spring国际化。
 */
public class TestSpringI18n {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Object[] objects = new Object[]{"atguigu", new Date().toString()};
        String value = context.getMessage("www.atguigu.com", objects, Locale.CHINA);
        System.out.println(value);
    }
}
