package com.sskim.demo;

import com.sskim.demo.domain.SoloMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoloManRunner implements ApplicationRunner {

    private final SoloMan soloMan;

    public SoloManRunner(SoloMan soloMan) {
        this.soloMan = soloMan;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("soloMan = " + soloMan);
    }
}
