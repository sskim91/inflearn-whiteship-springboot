package com.sskim.demo;

import com.sskim.demo.properties.SoloManProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleRunnerProperties implements ApplicationRunner {

    private final SoloManProperties soloManProperties;

    public SampleRunnerProperties(SoloManProperties soloManProperties) {
        this.soloManProperties = soloManProperties;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("properties 사용 Name: " + soloManProperties.getName());
        System.out.println("properties 사용 Age: " + soloManProperties.getAge());
        System.out.println("properties 사용 Duration: " + soloManProperties.getSessionTimeout());
    }
}
