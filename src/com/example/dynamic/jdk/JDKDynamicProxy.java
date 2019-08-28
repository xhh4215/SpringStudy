package com.example.dynamic.jdk;

import com.example.dynamic.aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {
//    声明目标类接口对象(真实对象)
    private TestDao testDao;

    /***
     * 创建代理的方法 建立代理对象和真实对象的代理关系 并返回代理对象
     */
    public Object createProxy(TestDao testDao){
        this.testDao = testDao;
        // 类加载器
        ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
        //被代理对象实现的所有的接口
        Class[] clazz = testDao.getClass().getInterfaces();
        //使用代理对象增强 并返回代理对象
        return Proxy.newProxyInstance(cld,clazz,this);
    }

    /***
     * 代理的逻辑处理方法 所有的动态代理类的方法调用都交给该方法处理
     * @param proxy 被代理的对象
     * @param method 将要执行的方法
     * @param args  执行方法的时候需要的参数
     * @return 指返回代理的结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//      创建一个切面
        MyAspect myAspect = new MyAspect();
//        前增强
        myAspect.check();
        myAspect.except();
//        在目标类上调用方法并传入参数，相当于调用testDao中的方法
        Object obj = method.invoke(testDao,args);
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
}
