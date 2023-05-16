package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;
import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 17:33
 */
// 部门类
public class Dept {

    private String dname;
    private List<Emp> empList;

    public void info() {
        System.out.println("部门名称：" + dname);
        for(Emp emp : empList) {
            System.out.println(emp.getEname());
            System.out.println(emp.getAge());
            System.out.println(Arrays.toString(emp.getLoves()));
        }
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
