package com.example.di.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImp implements TestDao {
    @Override
    public void save() {

    }
}
