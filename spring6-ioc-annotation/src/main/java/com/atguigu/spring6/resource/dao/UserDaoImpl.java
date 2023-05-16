package com.atguigu.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:00
 */
@Repository("myUserDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao...");
    }
}
