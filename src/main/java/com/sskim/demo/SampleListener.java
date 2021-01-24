package com.sskim.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner {

    public SampleListener(ApplicationArguments arguments) {
        //VM옵션에 -Dfoo
//        System.out.println("foo: " + arguments.containsOption("foo"));
        //Program argument에 --bar
//        System.out.println("bar: " + arguments.containsOption("bar"));

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("foo: " + args.containsOption("foo"));
//        System.out.println("bar: " + args.containsOption("bar"));
    }
}
