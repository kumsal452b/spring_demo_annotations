package com.kumsal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService2")
	private FortuneService fortuneService;
	
//	public TennisCoach(FortuneService theFotuneservice) {
//		this.fortuneService=theFotuneservice;
//	}
	public TennisCoach() {
		System.out.println(">>inside default consructor");
	}
	
//	public void kumsasgoway(FortuneService fortuneService) {
//		System.out.println(">>inside kumsal");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Praticte your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
