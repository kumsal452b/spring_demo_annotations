package com.kumsal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
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
