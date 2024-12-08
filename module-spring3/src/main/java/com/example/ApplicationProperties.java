package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "app")
public record ApplicationProperties(
        String foo,
        String bar,
        String baz,
        NestedApplicationProperties nested
) {
    private static String fooStatic = "foo";
    public static String getFooStatic() {
        return fooStatic;
    }
    public ApplicationProperties {
        fooStatic = foo; // This will update the static field when the record is created
    }
}