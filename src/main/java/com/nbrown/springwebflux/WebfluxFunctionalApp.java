package com.nbrown.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class WebfluxFunctionalApp {
 
    public static void main(String[] args) {
        SpringApplication.run(WebfluxFunctionalApp.class, args);
    }
}