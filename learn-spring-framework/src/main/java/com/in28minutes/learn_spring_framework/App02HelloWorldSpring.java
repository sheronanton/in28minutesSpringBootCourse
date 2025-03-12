package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1. Launch a Spring Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things we want Spring to manage - @Configuration

        System.out.println(context.getBean("name"));
        System.out.println("Push");

    }
}
