package com.raj.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource ds;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		//enable jdbc authentication provider
		
		auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("SELECT UNAME, PWD, STATUS FROM USERS WHERE UNAME=?")   //for authentication
		.authoritiesByUsernameQuery("SELECT USER_ID, ROLE FROM USER_ROLES WHERE USER_ID=?"); //for authorization
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyAuthority("CUSTOMER","MANAGER")
		.antMatchers("/approve").hasAuthority("MANAGER")
		.anyRequest().authenticated()
		.and()
		//.httpBasic()
		.formLogin()
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
	}

}
