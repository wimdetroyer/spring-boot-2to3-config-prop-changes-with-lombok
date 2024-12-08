package com.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Getter
@Setter
@ConfigurationProperties
@ToString(includeFieldNames = true)
public class NestedApplicationProperties {

    private String foo;
}
