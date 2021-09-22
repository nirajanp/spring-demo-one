package com.learnspring.demoone;

public class TrackCoach implements Coach {

    private HappyFortuneService theFortuneService;

    public TrackCoach(HappyFortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}
