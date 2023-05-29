package com.atguigu.spring6jdbctx.jdbc;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/26
 * @description
 */
public class Emp {

    private Integer id;
    private String name;
    private String sex;
    private Integer age;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
