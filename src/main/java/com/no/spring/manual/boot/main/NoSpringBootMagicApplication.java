package com.no.spring.manual.boot.main;


import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@Configuration
@EnableWebMvc
public class NoSpringBootMagicApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoSpringBootMagicApplication.class, args);
    }

}
