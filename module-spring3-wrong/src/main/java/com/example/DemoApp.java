package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoApp implements CommandLineRunner {

    @Autowired
    private ApplicationProperties applicationProperties;
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);

    }
    @Override
    public void run(String... args) {
        System.out.println(applicationProperties.toString());
    }
}