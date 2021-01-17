package com.sskim.demo.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ToString
@ConfigurationProperties("soloman")
public class SoloManProperties {

    private String name;
    private int age;
}
