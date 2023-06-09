package com.atguigu.spring6.iocxml.lifecycle;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 11:27
 */
public class User {

    // 无参构造
    public User() {
        System.out.println("1.bean对象创建，无参构造调用了。。。");
    }
    // 设置属性
    public void setName(String name) {
        System.out.println("2.给bean对象设置属性值");
        this.name = name;
    }
    // 初始化的方法
    public void initMethod() {
        System.out.println("4.bean对象初始化，调用指定的初始化方法");
    }
    // 销毁的方法
    public void destroyMethod() {
        System.out.println("7.bean对象销毁。调用指定销毁方法");
    }
    private String name;

    public String getName() {
        return name;
    }
}
