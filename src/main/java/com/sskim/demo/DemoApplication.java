package com.sskim.demo;

import com.sskim.demo.domain.SoloMan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        //코딩이 진다. banner.txt가 먼저 뜬다ㅋㅋ
        application.setBanner((environment, sourceClass, out) -> {
            out.println("======================");
            out.println("sskim");
            out.println("======================");
        });
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Bean
    public SoloMan soloMan() {
        SoloMan soloMan = new SoloMan();
        soloMan.setName("터프남");
        soloMan.setAge(30);
        return soloMan;
    }

}
