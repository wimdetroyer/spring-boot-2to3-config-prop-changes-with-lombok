package com.example;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Some description.
 *
 * @param url Must be filled in.
 * @param username Must be filled in.
 * @param required is it required?
 * @param nested nested props.
 */
@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationProperties(
        @NotBlank String url,
        @NotBlank String username,
        boolean required,
        @NestedConfigurationProperty NestedApplicationProperties nested // Only provides a hint for configuration metadata processing.
) {
}