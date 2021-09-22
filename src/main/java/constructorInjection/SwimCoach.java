package constructorInjection;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Swim Swim";
    }

    @Override
    public String getYourDailyFortune() {
        return "From swim coach: " + fortuneService.getYourDailyFortune();
    }
}
