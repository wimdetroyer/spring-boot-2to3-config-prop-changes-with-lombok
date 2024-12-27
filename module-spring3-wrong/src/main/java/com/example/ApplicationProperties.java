package com.example;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@Setter
@Getter
@ConfigurationProperties(prefix = "app")
@ToString
@AllArgsConstructor
public class ApplicationProperties {

        private String url;
        private String username;
        private boolean required;

        private final NestedApplicationProperties nested;
}
