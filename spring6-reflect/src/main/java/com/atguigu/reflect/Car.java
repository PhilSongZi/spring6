package com.atguigu.reflect;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/6 22:42
 */
public class Car {

    // 三个属性
    private String name;
    private int age;
    private String color;

    // 午餐构造
    public Car() {}

    // 有参构造
    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 普通方法
    private void run() {
        System.out.println("私有方法-run......");
    }

    // 对应的get和set方法
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
