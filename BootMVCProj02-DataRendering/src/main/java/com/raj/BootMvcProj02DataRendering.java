package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootMvcProj02DataRendering
        extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootMvcProj02DataRendering.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootMvcProj02DataRendering.class, args);
    }
}
