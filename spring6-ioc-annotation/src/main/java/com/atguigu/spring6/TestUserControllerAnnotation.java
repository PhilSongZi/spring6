package com.atguigu.spring6;

import com.atguigu.spring6.autowired.controller.UserController;
import com.atguigu.spring6.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 17:16
 */
public class TestUserControllerAnnotation {

    public static void main(String[] args) {
        // 加载配置类
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean(UserController.class);
        userController.add();
    }
}
