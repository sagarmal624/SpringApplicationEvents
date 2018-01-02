package com.sagarandcompany.SpringApplicationEvents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApplicationEventsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringApplicationEventsApplication.class, args);

        SpringApplication sa = new SpringApplication(SpringApplicationEventsApplication.class);
        ConfigurableApplicationContext context = sa.run(args);
        MyBean bean = context.getBean(MyBean.class);
        bean.doSomething();
        context.start();
        context.close();

    }
}
