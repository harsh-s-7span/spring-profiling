package com.learn.springprofiling.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TestService implements MainService{
    @Override
    public void doSomething() {
        System.out.println("Inside Test Environment...");
        System.out.println("I am working as a Test...");
    }
}
