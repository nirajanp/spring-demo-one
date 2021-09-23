package bean.scope.demo;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getYourDailyTraining() {
        return "Run 5k as fast as you can";
    }
}
