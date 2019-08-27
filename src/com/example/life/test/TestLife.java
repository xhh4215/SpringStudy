package com.example.life.test;

import com.example.life.BeanLife;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/****
 * bean的生命周期测试类
 */
public class TestLife {
    public static void main(String[] args) {
        /***
         * 初始化Spring容器，加载配置文件
         */
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("===== 获取对象之前 ======");

        BeanLife life = (BeanLife) ctx.getBean("beanlife");

        System.out.println("===== 获取对象之后 ======");
        //关闭容器销毁对象
        ctx.close();

    }
}
