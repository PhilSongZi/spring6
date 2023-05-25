package com.atguigu.spring6junit.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/19 17:48
 * @description 测试类
 */
// 两种方式
// 其一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean.xml")
// 其二
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringTestJunit5 {

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
