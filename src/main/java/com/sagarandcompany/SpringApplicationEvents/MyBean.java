package com.sagarandcompany.SpringApplicationEvents;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void doSomething() {
        System.out.println("-- in doSomething() --");
    }
}