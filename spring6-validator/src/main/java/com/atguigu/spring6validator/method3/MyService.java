package com.atguigu.spring6validator.method3;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 校验类,通过注解操作对象。
 */
@Service
@Validated
public class MyService {

    public String testParams(@NotNull @Valid User user) {
        return user.toString();
    }
}
