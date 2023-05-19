package com.atguigu.spring6.aop.exmple;

import org.junit.jupiter.api.Test;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/19 9:44
 * @description 测试类，分别测试实例、带日志实例、静态代理实现日志的实例、动态代理实现.
 */
public class CalculatorTest {

    @Test
    public void testCalculator() {
        Calculator calculator = new CalculatorImpl();
        calculator.add(1, 2);
        calculator.sub(1, 2);
        calculator.mul(1, 2);
        calculator.div(1, 2);
    }

    @Test
    public void testCalculatorLogImpl() {
        Calculator calculator = new CaculatorLogImpl();
        calculator.add(1, 2);
        calculator.sub(1, 2);
        calculator.mul(1, 2);
        calculator.div(1, 2);
    }

    @Test
    public void testCalculatorStaticProxy() {
        Calculator calculator = new CalculatorStaticProxy(new CalculatorImpl());
        calculator.add(1, 2);
        calculator.sub(1, 2);
        calculator.mul(1, 2);
        calculator.div(1, 2);
    }

    @Test
    public void testProxyFactory() {
        // 代理对象
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        //
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        // 调用方法
        proxy.add(1, 2);
        proxy.sub(1, 2);
        proxy.mul(1, 2);
        proxy.div(1, 2);
    }
}
