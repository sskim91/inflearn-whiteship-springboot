package com.sskim.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleRunner implements ApplicationRunner {

    @Value("${soloman.name}")
    private String name;

    @Value("${soloman.age}")
    private int age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
