package com.example;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties
public record NestedApplicationProperties (String foo){
}
