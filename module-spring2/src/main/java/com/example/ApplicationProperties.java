package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ConfigurationProperties(prefix = "app")
@ToString(includeFieldNames = true)
public class ApplicationProperties {


        private static String fooStatic = "foo";

        private String foo;
        private String bar;
        private String baz;

        @NestedConfigurationProperty private NestedApplicationProperties nested;

        public static String getFooStatic() {
            return fooStatic;
        }

        public void setFoo(String foo) {
            this.foo = foo;
            ApplicationProperties.fooStatic = foo;
        }
}
