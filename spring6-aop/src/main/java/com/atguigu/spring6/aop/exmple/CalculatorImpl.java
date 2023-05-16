package com.atguigu.spring6.aop.exmple;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @date 2023/5/8 15:12
 */
// 基本实现类
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {

        int result = i + j;
        System.out.println("方法内部 result = " + result);
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
