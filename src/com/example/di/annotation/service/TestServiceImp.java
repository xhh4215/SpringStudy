package com.example.di.annotation.service;

import com.example.di.annotation.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("testService")
public class TestServiceImp implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public void save() {
         testDao.save();
         System.out.println("testService save");
    }
}
