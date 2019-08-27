package com.xiaohei.service;

import com.xiaohei.dao.TestDIDao;

public class TestIDServiceImp1 implements TestIDService {
    private TestDIDao testDIDao;

    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService 使用setter注入 say hello Study hard");
    }
}
