package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name , int age, Address address){};
record Address(String area, String city){}

@Configuration
public class HelloWorldConfiguration {

        @Bean
        public String name(){
            return "Sheron";
        }

        @Bean
        public int age(){
            return 29;
        }

        @Bean
        @Primary
        public Person person(){
            return new Person("Antony",29, new Address("Tabaram", "Chennai"));
        }


        //Using method call
        @Bean
        public Person person2MethodCall(){
            return new Person(name(), age(), address());
        }

        //Using parameters
        @Bean
        public Person person3Parameters(String name , int age, Address address){
            return new Person(name, age, address);
        }

        @Bean
        public Person person4Parameters(String name , int age, @Qualifier("address2qualifier") Address address){
            return new Person(name, age, address);
        }


        @Bean(name = "address2")
        @Primary
        @Qualifier("address2qualifier")
        public Address address(){
            return new Address("Vandalur","Chennai");
        }
}
