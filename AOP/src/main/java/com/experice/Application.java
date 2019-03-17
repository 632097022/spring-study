package com.experice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Tiger tiger=context.getBean(Tiger.class);
        tiger.walk();
    }
}
