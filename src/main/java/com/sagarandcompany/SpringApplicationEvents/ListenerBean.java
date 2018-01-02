package com.sagarandcompany.SpringApplicationEvents;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerBean {
    @EventListener
    public void handleEvent(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent:.................... " + event);
    }

    @EventListener
    public void handleEvent(EmbeddedServletContainerInitializedEvent event) {
        System.out.println("server inisilization:.................... " + event);
    }

    @EventListener
    public void handleEvent(ApplicationReadyEvent event) {
        System.out.println("ApplicationReadyEvent:.................... " + event);
    }

    @EventListener
    public void handleEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent:.................... " + event);
    }

    @EventListener
    public void handleEvent(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent :.................... " + event);
    }
}