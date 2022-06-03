package com.learn.springprofiling.demo;

import org.springframework.stereotype.Service;

@Service
public class DefaultService implements MainService{
    @Override
    public void doSomething() {
        System.out.println("Inside Default Environment...");
        System.out.println("I am working as a Default...");
    }
}
