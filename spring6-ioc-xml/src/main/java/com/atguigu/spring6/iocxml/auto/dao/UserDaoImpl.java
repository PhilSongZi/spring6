package com.atguigu.spring6.iocxml.auto.dao;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 15:29
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao方法执行了");
        // 原生方法
//        UserDao userDao = new UserDaoImpl();
//        userDao.addUserDao();
    }
}
