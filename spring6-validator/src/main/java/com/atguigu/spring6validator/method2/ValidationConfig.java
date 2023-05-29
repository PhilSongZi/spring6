package com.atguigu.spring6validator.method2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 创建配置类，配置LocalValidatorFactoryBean.
 */
@Configuration
@ComponentScan("com.atguigu.spring6validator.method2")
public class ValidationConfig {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
