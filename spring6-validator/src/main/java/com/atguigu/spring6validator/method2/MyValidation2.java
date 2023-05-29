package com.atguigu.spring6validator.method2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 基于注解实现校验的方式2：spring。
 */
@Service
public class MyValidation2 {

    @Autowired  // field injection is not recommended
    private Validator validator;

    public boolean validatorByUserTwo(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user, bindException);
        // 输出明确的信息
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);
        return bindException.hasErrors();
    }
}
