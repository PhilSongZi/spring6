package com.atguigu.spring6.aop.annoaop;

import org.springframework.stereotype.Component;

/**
 * @author 小子松
 * @version 1.0
 * @description 基本实现类。
 * @date 2023/5/8 15:12
 */
// 基本实现类
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        int result = i + j;
        System.out.println("方法内部 result = " + result);

        // 模拟异常出现。测试 AfterThrowing
//        int a = 1/0;
        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;
        System.out.println("方法内部 result = " + result);
        return result;
    }
}
