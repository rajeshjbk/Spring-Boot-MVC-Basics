package com.raj;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj11I18nApplication {

	@Bean(name = "localeResolver")  //fixed bean id
	public SessionLocaleResolver createResolver() {
		
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		resolver.setDefaultLocale(Locale.of("en","US"));
		
		return resolver;
	}
	
	@Bean(name = "lci")
	public LocaleChangeInterceptor createInterceptor() {
		
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang"); //request param excepting local info
		
		return lci;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj11I18nApplication.class, args);
	}
	
}
