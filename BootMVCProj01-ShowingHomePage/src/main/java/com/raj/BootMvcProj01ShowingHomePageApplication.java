package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootMvcProj01ShowingHomePageApplication
        extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootMvcProj01ShowingHomePageApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootMvcProj01ShowingHomePageApplication.class, args);
    }
}
