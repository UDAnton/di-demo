package com.github.udanton.didemo.controllers;


import com.github.udanton.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {
    GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
