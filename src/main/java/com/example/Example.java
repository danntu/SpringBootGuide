package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class Example {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled","false");

        SpringApplication application = new SpringApplication(Example.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @RequestMapping("/")
    String home(){
        return "Hello World";
    }
}
