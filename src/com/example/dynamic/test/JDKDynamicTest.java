package com.example.dynamic.test;

import com.example.dynamic.jdk.JDKDynamicProxy;
import com.example.dynamic.jdk.TestDao;
import com.example.dynamic.jdk.TestDaoImp;

public class JDKDynamicTest {
    public static void main(String[] args) {
        //创建代理对象
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        //创建目标对象
        TestDao  testDao = new TestDaoImp();
        /***
         * 从代理对象中获取增强后的目标对象 该对象是一个被代理的对象 他会进入
         * 代理的逻辑方法
         */
        TestDao testDaoAdvice = (TestDao) jdkDynamicProxy.createProxy(testDao);
        //执行方法
        testDaoAdvice.save();
        System.out.println("=====================");
        testDaoAdvice.modify();
        System.out.println("=====================");
        testDaoAdvice.delete();


    }
}
