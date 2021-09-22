package com.learnspring.demoone;

public class BaseballCoach implements Coach{

    private HappyFortuneService fortuneService;

    // Define constructor for dependency injection
    public BaseballCoach(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
       return ("Spend 30 mins on batting practice");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
