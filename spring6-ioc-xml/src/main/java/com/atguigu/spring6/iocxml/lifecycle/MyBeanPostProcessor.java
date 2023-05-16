package com.atguigu.spring6.iocxml.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 15:02
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public java.lang.Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws
            org.springframework.beans.BeansException {
        System.out.println("3.bean后置处理器，初始化之前执行");
        System.out.println("☆☆☆" + beanName + " = " + bean);
        return bean;
    }

    @Override
    public java.lang.Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) throws
            org.springframework.beans.BeansException {
        System.out.println("5.bean后置处理器，初始化之后执行");
        System.out.println("★★★" + beanName + " = " + bean);
        return bean;
    }
}
