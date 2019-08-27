package com.example.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstance {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /***
         * b1 b11测试singleton属性 和prototype属性
         */
        //==============================================

        BeanClass b1= (BeanClass) applicationContext.getBean("constructorInstance");
         System.out.println(b1);
         System.out.println(b1.message);
        BeanClass b11= (BeanClass) applicationContext.getBean("constructorInstance");
        System.out.println(b11);
        System.out.println(b1.message);
        //===============================================


        BeanClass b2 = (BeanClass) applicationContext.getBean("staticfactory");
        System.out.println(b2.message);
        BeanClass b3 = (BeanClass) applicationContext.getBean("staticfactoryinstance");
         System.out.println(b3.message);
    }

}
