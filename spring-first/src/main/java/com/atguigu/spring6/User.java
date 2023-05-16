package com.atguigu.spring6;

/**
 * @author 小子松
 * @version 1.0
 * @Description
 * @date 2023/5/5 11:49
 */
public class User {

    // 无参构造
    public User() {
        System.out.println("0:无参数构造执行了");
    }
    public void add() {
        System.out.println("add......");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
