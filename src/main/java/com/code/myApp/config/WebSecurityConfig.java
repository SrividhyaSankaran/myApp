package com.code.myApp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.http.HttpMethod;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfiguration {
	
	protected void configure(HttpSecurity security) throws Exception {
		
		security.cors().and().csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers(HttpMethod.OPTIONS,"**").permitAll();
	}
}
