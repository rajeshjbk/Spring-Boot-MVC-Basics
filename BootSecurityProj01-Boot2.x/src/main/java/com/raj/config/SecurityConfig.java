package com.raj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.raj.encoder.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	//without password encrypted
	/*@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("raj").password("{noop}asha").roles("CUSTOMER");
		auth.inMemoryAuthentication().withUser("ramesh").password("{noop}hyd").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("rajesh").password("{noop}vizag").roles("VISITOR");

	}*/
	
	//with password encrypted
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("raj").password("$2a$10$y1YV/7wMUhCZ9lJCNulGqe8D90/AIa8P9N2tDSAcT.IR4LzEBYxv2").roles("CUSTOMER");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("ramesh").password("$2a$10$1E7siIr1isB5/7hNDGGr8e4w75j/xSM5mqXmM7CcrvWA2VPDSp7KS").roles("MANAGER");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("rajesh").password("$2a$10$s8zoth0Uex7xtEkq0sRWHus2YUmvB3/uTaojCaDAwnxX6SpWYF8HG").roles("VISITOR");

	}

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyRole("CUSTOMER","MANAGER")
		.antMatchers("/approve").hasRole("MANAGER")
		.anyRequest().authenticated()
		.and()
		//.httpBasic()
		.formLogin()
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
	}

}
