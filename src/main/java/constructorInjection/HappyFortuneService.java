package constructorInjection;
// Define dependency class
public class HappyFortuneService implements FortuneService{
    @Override
    public String getYourDailyFortune() {
        return "You have a great day ahead!";
    }
}
