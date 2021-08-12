package com.czj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.czj")
public class AppConfig {

	@Bean
	public User user() {
		return new User();
	}
}
