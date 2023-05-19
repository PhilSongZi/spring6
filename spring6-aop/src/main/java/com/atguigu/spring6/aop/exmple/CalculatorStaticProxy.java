package com.atguigu.spring6.aop.exmple;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/19 9:33
 * @description 静态代理的实现类。.
 */
public class CalculatorStaticProxy implements Calculator{

    // 被代理目标对象声明为成员变量
    private Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public int add(int i, int j) {
        // 附加功能如打印日志由代理类中的代理方法来实现
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务
        int addResult = calculator.add(i, j);

        System.out.println("[日志] add 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        // 附加功能如打印日志由代理类中的代理方法来实现
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务
        int subResult = calculator.sub(i, j);

        System.out.println("[日志] sub 方法结束了，结果是：" + subResult);
        return subResult;
    }

    @Override
    public int mul(int i, int j) {
        // 附加功能如打印日志由代理类中的代理方法来实现
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务
        int mulResult = calculator.mul(i, j);

        System.out.println("[日志] add 方法结束了，结果是：" + mulResult);
        return mulResult;
    }

    @Override
    public int div(int i, int j) {
        // 附加功能如打印日志由代理类中的代理方法来实现
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务
        int divResult = calculator.div(i, j);

        System.out.println("[日志] add 方法结束了，结果是：" + divResult);
        return divResult;
    }
}
