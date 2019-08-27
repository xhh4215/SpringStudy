package com.example.instance;

public class BeanInstanceFactory {
    public BeanClass createFactoryInstance(){
        return new BeanClass("调用实例工厂方法实例化bean");
    }
}
