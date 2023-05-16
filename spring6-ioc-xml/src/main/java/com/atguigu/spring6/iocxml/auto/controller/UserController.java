package com.atguigu.spring6.iocxml.auto.controller;

import com.atguigu.spring6.iocxml.auto.service.UserService;
import com.atguigu.spring6.iocxml.auto.service.UserServiceImpl;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 15:27
 */
public class UserController {

    private UserService userService;

    public void addUser() {
        System.out.println("controller方法执行了");
        // 调用service方法
        userService.addUserService();
        // 原生方法
//        UserService userService = new UserServiceImpl();
//        userService.addUserService();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
