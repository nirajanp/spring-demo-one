package setterInjection;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    String [] fortuneArr = {"Happy", "Chill", "Hardworking"};

    @Override
    public String getYouDailyFortune() {
        Random r = new Random();
        int randomNum = r.nextInt(fortuneArr.length);
        return fortuneArr[randomNum];
    }

}
