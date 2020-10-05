package com.kumsal.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kumsal.springdemo")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swinCoach(){
		return new SwimCoach(sadFortuneService());
	}

}
