package com.java.spring;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    FortuneService fortuneService;
    // define a contructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
