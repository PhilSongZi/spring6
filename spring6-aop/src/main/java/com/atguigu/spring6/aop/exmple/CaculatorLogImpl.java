package com.atguigu.spring6.aop.exmple;

/**
 * @author 小子松
 * @version 1.0
 * @description 带日志的实现类。
 * @date 2023/5/8 15:15
 */
// 带日志的实现类
public class CaculatorLogImpl implements Calculator {

    @Override
    public int add(int i, int j) {

        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        int result = i + j;

        System.out.println("方法内部 result = " + result);

        System.out.println("[日志] add 方法结束了，结果是：" + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);

        int result = i - j;

        System.out.println("方法内部 result = " + result);

        System.out.println("[日志] sub 方法结束了，结果是：" + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        System.out.println("[日志] mul 方法结束了，结果是：" + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        System.out.println("[日志] div 方法结束了，结果是：" + result);

        return result;
    }
}