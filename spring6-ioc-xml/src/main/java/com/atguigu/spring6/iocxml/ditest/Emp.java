package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 17:34
 */
// 员工类
public class Emp {

    // 对象类型属性——员工属于某个部门
    private Dept dept;
    private String ename;
    private Integer age;
    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work() {
        System.out.println(ename + " work..." + age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
