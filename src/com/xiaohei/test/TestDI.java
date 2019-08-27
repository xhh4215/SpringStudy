package com.xiaohei.test;

import com.xiaohei.service.TestIDService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestIDService ts = (TestIDService) applicationContext.getBean("testDIService");
        ts.sayHello();
    }
}
