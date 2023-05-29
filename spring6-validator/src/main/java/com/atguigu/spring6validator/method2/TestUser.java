package com.atguigu.spring6validator.method2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description
 */
public class TestUser {

    @Test
    public void testValidationOne() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 validation1 = context.getBean(MyValidation1.class);

        User user = new User();
        user.setAge(20);
        user.setName("jcaky");
        boolean validator = validation1.validatorByUserOne(user);
        System.out.println(validator);
    }

    @Test
    public void testValidationTwo() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 validation2 = context.getBean(MyValidation2.class);

        User user = new User();
        user.setAge(-1);
        user.setName("songzi");
        boolean validator = validation2.validatorByUserTwo(user);
        System.out.println(validator);
    }

}
