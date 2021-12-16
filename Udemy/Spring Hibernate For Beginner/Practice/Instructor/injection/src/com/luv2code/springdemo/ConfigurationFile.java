package com.luv2code.springdemo;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

@Configuration
@PropertySource(value="classpath:users.properties", name="properties")
public class ConfigurationFile {
	@Bean
	public PropertyPlaceholderConfigurer properties() {
		PropertyPlaceholderConfigurer p = new PropertyPlaceholderConfigurer();
		ClassPathResource r = new ClassPathResource("users.properties");
		p.setLocation(r);
		return p;
	}
}
