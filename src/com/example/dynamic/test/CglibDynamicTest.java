package com.example.dynamic.test;

import com.example.dynamic.cglib.CglibDynamicProxy;
import com.example.dynamic.cglib.TestDao;

public class CglibDynamicTest {
    public static void main(String[] args) {
        CglibDynamicProxy cglibDynamicProxy  = new CglibDynamicProxy();
        TestDao testDao = new TestDao();
        TestDao testDaoAdvice = (TestDao) cglibDynamicProxy.createProxy(testDao);
        testDaoAdvice.save();
        System.out.println("=====================");

        testDaoAdvice.modify();
        System.out.println("=====================");

        testDaoAdvice.delete();
    }
}
