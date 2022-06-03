package com.learn.springprofiling.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevService implements MainService{

    @Override
    public void doSomething() {
        System.out.println("Inside Dev Environment...");
        System.out.println("I am working as a Developer...");
    }
}
