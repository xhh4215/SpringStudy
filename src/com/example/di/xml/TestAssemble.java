package com.example.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssemble {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ComplexUser complexUser1 = (ComplexUser) applicationContext.getBean("user1");
        System.out.println(complexUser1.toString());
        ComplexUser complexUser2 = (ComplexUser) applicationContext.getBean("user2");
        System.out.println(complexUser2.toString());

    }
}
