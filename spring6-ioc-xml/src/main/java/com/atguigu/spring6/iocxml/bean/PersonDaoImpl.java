package com.atguigu.spring6.iocxml.bean;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 16:16
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("person run......");
    }
}
