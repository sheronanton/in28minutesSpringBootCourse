package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1. Launch a Spring Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things we want Spring to manage - @Configuration

        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

//        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBean("address2"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person4Parameters"));


        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

    }
}
