package com.atguigu.spring6validator.method3;

import com.atguigu.spring6validator.method4.CannotBlank;
import jakarta.validation.constraints.*;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description 实体类,使用注解设置校验规则。
 */
public class User {

    @NotNull
    private String name;

    @Min(0)
    @Max(120)
    private int age;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @CannotBlank // 自定义校验注解：不可包含空格。
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
