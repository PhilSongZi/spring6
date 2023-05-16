package com.atguigu.service.impl;

import com.atguigu.annotation.Bean;
import com.atguigu.annotation.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/8 9:42
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service......");
        // 调用dao的方法
        userDao.add();
    }
}
