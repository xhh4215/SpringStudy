package com.example.di.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/***
 * 创建一个bean的实现类
 */
@Component
public class AnnotationUser {
    @Value("栾桂明")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
