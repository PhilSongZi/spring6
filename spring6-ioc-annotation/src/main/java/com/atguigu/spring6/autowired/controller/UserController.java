package com.atguigu.spring6.autowired.controller;

import com.atguigu.spring6.autowired.service.UserService;
import com.atguigu.spring6.autowired.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:01
 */
@Controller
public class UserController {

    // 注入service
    // 第一种方式 属性注入
//    @Autowired  // 根据类型找到对应对象 完成注入
//    private UserService userService;

    // 第二种方式 set注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    // 第三种方式 构造
//    @Autowired
//    private UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    // 第四种方式 形参注入
//    private UserService userService;
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }

    // 第五种：当有参数的构造方法只有一个时，@Autowired注解可以省略。
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 第六种：@Autowired注解和@Qualifier注解联合
    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
