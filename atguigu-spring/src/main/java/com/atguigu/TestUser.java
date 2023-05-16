package com.atguigu;

import com.atguigu.bean.AnnotationApplicationContext;
import com.atguigu.bean.ApplicationContext;
import com.atguigu.service.UserService;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @date 2023/5/8 14:31
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationApplicationContext("com.atguigu");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
