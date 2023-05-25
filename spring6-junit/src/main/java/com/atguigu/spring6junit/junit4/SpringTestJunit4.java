package com.atguigu.spring6junit.junit4;

import com.atguigu.spring6junit.junit5.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/19 17:48
 * @description 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit4 {

    // 注入
    @Autowired
    private User user;

    // 测试方法
    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }
}
