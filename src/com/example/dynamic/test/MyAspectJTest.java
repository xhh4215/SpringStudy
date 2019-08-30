package com.example.dynamic.test;
import com.example.dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAspectJTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中，获取增强后的目标对象
        TestDao testDaoAdvice = (TestDao)applicationContext.getBean("testDao");
        //执行方法
        testDaoAdvice.save();
    }
}
