package setterInjection;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getYouDailyFortune() {
        return "You fortune is bright ;)";
    }
}
