package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 15:18
 */
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
