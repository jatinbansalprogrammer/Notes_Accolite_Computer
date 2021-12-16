package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private String email;
	private double height;

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("BaseballCoach()");
	}
	
	private void initMethod() {
		System.out.println("initMethod()");
	}
	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}








