package com.github.udanton.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    public String hello(){
        System.out.println("hello");
        return "foo";
    }

}
