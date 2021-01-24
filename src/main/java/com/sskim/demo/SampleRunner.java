package com.sskim.demo;

import com.sskim.demo.properties.SoloManProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleRunner implements ApplicationRunner {

    @Autowired
    public String hello;

    @Autowired
    private SoloManProperties soloManProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=================");
        System.out.println("hello = " + hello);
        System.out.println("soloManProperties.Name() = " + soloManProperties.getName());
        System.out.println("soloManProperties.FullName() = " + soloManProperties.getFullName());
        System.out.println("=================");
    }
}
