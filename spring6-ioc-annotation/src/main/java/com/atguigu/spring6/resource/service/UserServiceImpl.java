package com.atguigu.spring6.resource.service;

import com.atguigu.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:01
 */
@Service(value = "myUserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "myUserDao")
    private UserDao myUserDao;
    @Override
    public void add() {
        System.out.println("service...");
        myUserDao.add();
    }
}
