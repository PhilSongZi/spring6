package com.atguigu.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/19 10:42
 * @description 切面类.
 */
@Aspect     // 切面类
@Component      // IoC容器
public class LogAspect {

    // 设置切入点和通知类型
    // 切入点表达式：execution(访问修饰符 增强方法返回类型 增强方法所在类全路径.方法名称(方法参数))
    // 通知类型：
    // 前置 @Before(value = "切入点表达式配置切入点")
    // 重用切入点表达式（不同一个包内）
    @Before("com.atguigu.spring6.aop.annoaop.LogAspect.pointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        // 获取连接点的签名信息
        String methodName = joinPoint.getSignature().getName();
        // 回去目标方法的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名："+methodName+"，参数："+args);
    }

    // 返回 @AfterReturning
    // @AfterReturning中的属性returning，用来将通知方法的某个形参，接收目标方法的返回值
    @AfterReturning(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，返回结果："+result);
    }
    // 异常 @AfterThrowing
    // 目标方法出现异常，此通知执行
    // @AfterThrowing中的属性throwing，用来将通知方法的某个形参，接收目标方法的异常
    @AfterThrowing(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名："+methodName+"，异常信息："+ex);
    }

    // 后置 @After
    // 重用切入点表达式（同一个包内）
    @After("pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->后置通知，方法名："+methodName+"，参数："+args);
    }
    // 环绕 @Around
    @Around(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知==目标方法执行之前");
            // 调用目标方法
            result = joinPoint.proceed();
            System.out.println("环绕通知==目标方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知==目标方法出现异常执行");
        } finally {
            System.out.println("环绕通知==目标方法执行完毕");
        }
        return result;
    }

    // 重用切入点表达式
    @Pointcut(value = "execution(* com.atguigu.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut() {}
}
