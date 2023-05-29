package com.atguigu.spring6validator.method2;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 基于注解实现校验的校验方式1：java原生。ji: jakarta.validation.Validator
 */
@Service
public class MyValidation1 {

    @Autowired
    private Validator validator;

    public boolean validatorByUserOne(User user) {
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }
}
