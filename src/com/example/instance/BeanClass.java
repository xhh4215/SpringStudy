package com.example.instance;

/***
 * 使用构造方法实例化bean
 */
public class BeanClass {
    public String message;
    public BeanClass(){
        message ="this is a good message";
    }
    public BeanClass(String message){
        this.message = message;
    }
}
