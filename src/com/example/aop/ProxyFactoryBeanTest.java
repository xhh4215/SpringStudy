package com.example.aop;

import com.example.dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDaoAdvice = (TestDao) applicationContext.getBean("testDaoProxy");
        testDaoAdvice.save();
        System.out.println("=============================");
        testDaoAdvice.modify();
        System.out.println("=============================");
        testDaoAdvice.delete();
    }
}
