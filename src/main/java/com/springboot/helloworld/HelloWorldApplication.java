package com.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    @GetMapping
    public String applicationStatus(){
        return "Application is running";
    }

    @GetMapping("/name")
    public String welcome(){
        return "Hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
