# SpringApplicationEvents
https://www.sagarandcompany.com/
                                                 # Application-Events-With-spring


Application events are less used in real applications, but internally in Spring framework (ContextRefreshedEvent, RequestHandledEvent, etc…),
but also in Spring Boot (ApplicationStartedEvent, ApplicationEnvironmentPreparedEvent, etc …) are used intensively.

Basically the Spring ApplicationContext is capable to behave like an event bus which enables simple communication between Spring beans 
within the same ApplicationContext

# @EventListener
This is a core annotation, no extra configuration is needed using Java config. Internally the EventListenerMethodProcessor 
registers an ApplicationListener instance with the event type inferred from the method signature.

```java
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
```
