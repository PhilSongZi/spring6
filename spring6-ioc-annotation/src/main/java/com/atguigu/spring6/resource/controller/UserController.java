package com.atguigu.spring6.resource.controller;

import com.atguigu.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:01
 */
@Controller("myUserController")
public class UserController {

    // 根据名称进行注入
    @Resource(name = "myUserService")
    private UserService userService;
    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
