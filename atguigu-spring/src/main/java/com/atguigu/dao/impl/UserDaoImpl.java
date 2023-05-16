package com.atguigu.dao.impl;

import com.atguigu.annotation.Bean;
import com.atguigu.dao.UserDao;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/8 9:42
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao......");
    }
}
