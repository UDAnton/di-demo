package com.github.udanton.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class OtherGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Other Hello";
    }
}
