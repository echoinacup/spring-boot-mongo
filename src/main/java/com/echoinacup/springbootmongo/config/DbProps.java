package com.echoinacup.springbootmongo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("db")
public record DbProps(String userName, String password, String url) {
}
