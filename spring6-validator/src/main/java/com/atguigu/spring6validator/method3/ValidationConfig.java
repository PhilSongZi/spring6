package com.atguigu.spring6validator.method3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 配置类，基于方法实现校验。
 */
@Configuration
@ComponentScan("com.atguigu.spring6validator.method3")
public class ValidationConfig {

    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
