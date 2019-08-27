package com.xiaohei.service;

import com.xiaohei.dao.TestDIDao;

public class TestIDServiceImp implements TestIDService {
    private TestDIDao testDIDao;

    public TestIDServiceImp(TestDIDao testDIDao) {
        super();
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService构造方法注入 say hello Study hard");
    }
}
