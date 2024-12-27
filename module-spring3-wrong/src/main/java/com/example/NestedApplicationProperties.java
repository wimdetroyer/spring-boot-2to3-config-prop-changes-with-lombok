package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Getter
@Setter
// @ConfigurationProperties // This isn't needed anymore in SB3
@ToString(includeFieldNames = true)
public class NestedApplicationProperties {

    private String foo;
}
