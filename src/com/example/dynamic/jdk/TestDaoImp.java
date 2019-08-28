package com.example.dynamic.jdk;

import com.example.di.annotation.controller.TestController;

public class TestDaoImp implements TestDao {
    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void modify() {
        System.out.println("修改");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
