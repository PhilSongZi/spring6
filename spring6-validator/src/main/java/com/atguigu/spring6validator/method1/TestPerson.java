package com.atguigu.spring6validator.method1;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 校验测试。
 */
public class TestPerson {

    public static void main(String[] args) {
        //创建对象
        Person person = new Person();
        person.setAge(-1);
        person.setName("jacky");
        // 创建Person对应 databinder
        DataBinder binder = new DataBinder(person);
        // 设置校验器
        binder.setValidator(new PersonValidator());
        // 调用方法执行校验
        binder.validate();
        // 输出校验结果
        BindingResult results = binder.getBindingResult();
        System.out.println(results.getAllErrors());
    }
}
