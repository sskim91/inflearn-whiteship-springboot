package com.sskim.demo.config;

import com.sskim.demo.domain.SoloMan;
import com.sskim.demo.properties.SoloManProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SoloManProperties.class)
public class SoloManConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SoloMan soloMan(SoloManProperties properties) {
        SoloMan soloMan = new SoloMan();
        soloMan.setName(properties.getName());
        soloMan.setAge(properties.getAge());
        return soloMan;
    }
}
