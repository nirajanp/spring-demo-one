package setterInjection;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getYourDailyWorkout() {
        return "Master batting";
    }

    @Override
    public String getYouDailyFortune() {
        return "From cricket coach: " + fortuneService.getYouDailyFortune();
    }
}
