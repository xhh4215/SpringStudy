package com.example.instance;

public class BeanStaticFactory {
    private static BeanClass beaninstance = new BeanClass("调用静态方法进行Bean的初始化");

    public static BeanClass createInstance() {
        return beaninstance;
    }
}
