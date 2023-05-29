package com.atguigu.spring6validator.method3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 测试校验结果。包含method3和method4.
 */
public class TestUser {

    @Test
    public void testMyService1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService myService = context.getBean(MyService.class);
        User user = new User();
        user.setAge(24);
        user.setPhone("15927339091");
        user.setName("songzi");
        user.setMessage("test a t guigu");
        myService.testParams(user);
    }
}
