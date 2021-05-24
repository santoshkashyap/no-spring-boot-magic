package com.no.spring.manual.boot.main;


import org.springframework.boot.SpringApplication;

import com.no.spring.manual.boot.config.MagicApp;


@MagicApp
public class NoSpringBootMagicApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoSpringBootMagicApplication.class, args);
    }

}
