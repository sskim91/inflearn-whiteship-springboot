package com.sskim.demo.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.time.Duration;

@Getter
@Setter
@ToString
@ConfigurationProperties("soloman")
@Validated
public class SoloManProperties {

    @NotEmpty
    private String name;
    private int age;
    private String fullName;
    private Duration sessionTimeout = Duration.ofSeconds(30);
}
