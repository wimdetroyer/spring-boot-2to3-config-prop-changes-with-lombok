package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated // Validation enables startup-time safety
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