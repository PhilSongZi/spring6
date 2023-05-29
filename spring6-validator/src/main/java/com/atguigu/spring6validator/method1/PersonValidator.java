package com.atguigu.spring6validator.method1;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 1. 通过Validator接口实现数据校验。
 */
public class PersonValidator implements Validator {

    // supports方法用来表示此校验用在哪个类型上
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    // validate是设置校验逻辑的地点，其中ValidationUtils，是Spring封装的校验工具类，帮助快速实现校验
    @Override
    public void validate(Object target, Errors errors) {
        // name 不能为空
        ValidationUtils.rejectIfEmpty(errors,"name", "name.empty", "name is null.");

        // age 不能<0 不能>200
        Person p = (Person) target;
        if(p.getAge() < 0) {
            errors.rejectValue("age", "age.value.error", "error value < 0");
        } else if (p.getAge() > 200) {
            errors.rejectValue("age", "age.value.error.old", "error value too old");
        }
    }
}
