package com.example.di.annotation;

import com.example.di.annotation.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationContext.xml");
        AnnotationUser user = (AnnotationUser) applicationContext.getBean("annotationUser");
        System.out.println(user.getName());
        TestController testController = (TestController) applicationContext.getBean("testController");
        testController.save();
    }
}
