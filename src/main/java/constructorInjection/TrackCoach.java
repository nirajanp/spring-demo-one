package constructorInjection;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    // Step 2: create a constructor in your class for injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run faster Dude!!";
    }

    @Override
    public String getYourDailyFortune() {
        return "From track coach: " +fortuneService.getYourDailyFortune();
    }


}
