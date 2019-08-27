package com.example.di.annotation.controller;

import com.example.di.annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    private TestService testServicel;
    public void save(){
        testServicel.save();
        System.out.println("testControler save");
    }
}
