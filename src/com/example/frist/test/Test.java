package com.example.frist.test;

import com.example.frist.dao.TestDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
    /***
     * springioc 容器 的设计主要基于BeanFactory和ApplicationContext
     */
    public static void main(String[] args) {
/***
 *        ApplicationContext除了包含所有的beanFactory的功能外还支持 国际化 事件传播等等
 */
//        通过 ClassPathXmlApplicationContext 创建
        ApplicationContext xmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao dao = (TestDao) xmlApplicationContext.getBean("test");
        dao.sayHello();
//        通过 FileSystemXmlApplicationContext 创建
        ApplicationContext fileApplicationContext =
                new FileSystemXmlApplicationContext("C:\\Users\\18734\\IdeaProjects\\SpringProject\\src\\applicationContext.xml");
        TestDao dao1 = (TestDao) fileApplicationContext.getBean("test");
        dao1.sayHello();
//        通过web服务器实现对ApplicationContext的创建

//         使用BeanFactory创建bean
        BeanFactory factory =
                new XmlBeanFactory(new FileSystemResource("C:\\Users\\18734\\IdeaProjects\\SpringProject\\src\\applicationContext.xml"));
        TestDao testDao = (TestDao) factory.getBean("test");
        testDao.sayHello();

    }
}
