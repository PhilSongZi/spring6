package com.atguigu.spring6.aop.exmple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/19 10:00
 * @description 动态代理实现.
 */
public class ProxyFactory {

    // 获取目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public Object getProxy() {
        /**
         * Proxy.newProxyInstance()方法
         * 第一个参数： @ClassLoader 加载动态生成代理类的类加载器
         * 第二个参数： @Class[] interfaces 目标对象实现的所有接口的class数组
         * 第三个参数： @InvocationHandler 设置代理对象实现目标对象方法的过程
         */
        // 第一个参数： @ClassLoader 加载动态生成代理类的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 二个参数： @Class[] interfaces 目标对象实现的所有接口的class数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
        // 第三个参数： @InvocationHandler 设置代理对象实现目标对象方法的过程
        InvocationHandler invocationHandler = new InvocationHandler() {

            // 参数列表：代理对象、需要重写的目标对象的方法、method中的参数
            @Override
            public Object invoke(Object proxy,
                                 Method method,
                                 Object[] args) throws Throwable {
                // 方法调用之前输出
                System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                // 调用目标方法
                Object invoke = method.invoke(target, args);
                // 方法调用之后输出
                System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ invoke);
                return invoke;
            }
        };

        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
