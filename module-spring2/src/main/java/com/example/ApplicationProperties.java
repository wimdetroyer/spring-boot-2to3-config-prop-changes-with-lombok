package com.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@Setter
@Getter
@ConfigurationProperties(prefix = "app")
@ToString
@RequiredArgsConstructor
public class ApplicationProperties {

        private String url;
        private String username;
        private boolean required;

        private final NestedApplicationProperties nested;
}
