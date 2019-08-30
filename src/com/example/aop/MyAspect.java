package com.example.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

// 切面类
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation args0) throws Throwable {
        check();
        except();
        //执行目标方法
        Object obj = args0.proceed();
        log();
        monitor();
        return obj;

    }

    public void check() {
        System.out.println("模拟权限控制");
    }

    public void except() {
        System.out.println("模拟异常处理");
    }

    public void log() {
        System.out.println("模拟日志记录");
    }

    public void monitor() {
        System.out.println("性能测试");
    }
}
