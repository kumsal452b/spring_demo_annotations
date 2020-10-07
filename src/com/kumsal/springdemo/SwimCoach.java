package com.kumsal.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:sport.propeties")
public class SwimCoach implements Coach {

	FortuneService fortuneService;
	@Value("{foo.team}")
	private String team;
	
	@Value("{foo.email}")
	private String emmai;
	
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
