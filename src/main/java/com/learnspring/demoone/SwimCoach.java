package com.learnspring.demoone;

public class SwimCoach implements Coach{

    private HappyFortuneService fortuneService;

    public SwimCoach(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Swim Swim";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
