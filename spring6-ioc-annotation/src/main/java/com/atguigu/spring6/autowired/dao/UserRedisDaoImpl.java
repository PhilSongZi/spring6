package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 21:46
 */
@Repository
public class UserRedisDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao redis");
    }
}
