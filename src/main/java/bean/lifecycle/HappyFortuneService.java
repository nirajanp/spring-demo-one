package bean.lifecycle;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You have a bright day ahead";
    }
}
