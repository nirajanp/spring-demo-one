package setterInjection;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg c constructor");
    }
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach. inside setter method - setFortuneService");
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
