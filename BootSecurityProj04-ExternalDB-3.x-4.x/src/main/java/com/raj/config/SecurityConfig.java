package com.raj.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Autowired
	private DataSource ds ;

	@Bean   // For Authentication and Authorization
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(requests -> requests
				.requestMatchers("/bank/welcome").permitAll()
				.requestMatchers(
						"/bank/balance",
						"/bank/approve",
						"/bank/offers"
						).authenticated()
				)
		.formLogin(Customizer.withDefaults());

		return http.build();
	}

	@Bean
	public UserDetailsManager userDetailsService() {
	
		 return new JdbcUserDetailsManager(ds);
	}
}
