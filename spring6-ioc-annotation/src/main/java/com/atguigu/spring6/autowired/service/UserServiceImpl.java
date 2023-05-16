package com.atguigu.spring6.autowired.service;

import com.atguigu.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:01
 */
@Service
public class UserServiceImpl implements UserService{

    // 注入dao
    // 第一种方式 属性注入
//    @Autowired  // 根据类型找到对应对象 完成注入
//    private UserDao userDao;

    // 第二种方式 set注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // 第三种方式 构造注入
//    @Autowired
//    private UserDao userDao;
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // 第四种方式 形参注入
//    private UserDao userDao;
//    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

    // 第五种：当有参数的构造方法只有一个时，@Autowired注解可以省略。
//    private UserDao userDao;
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // 第六种：@Autowired注解和@Qualifier注解联合，根据名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service...");
        userDao.add();
    }
}
