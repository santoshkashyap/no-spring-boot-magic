package com.no.spring.manual.boot.main;


import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.DispatcherServlet;

import com.no.spring.manual.boot.config.MvcConfig;
import com.no.spring.manual.boot.config.TomcatConfig;

@ComponentScan
@Configuration
@Import({TomcatConfig.class, DispatcherServlet.class, MvcConfig.class})
public class NoSpringBootMagicApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoSpringBootMagicApplication.class, args);
    }

}
