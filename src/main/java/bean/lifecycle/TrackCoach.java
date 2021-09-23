package bean.lifecycle;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k faster as hell";
    }

    @Override
    public String getFortune() {
        return "From Taack Coach " + fortuneService.getFortune();
    }

    // add init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add destroy method
    public void doCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
