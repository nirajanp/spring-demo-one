package setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("theCricketCoach", Coach.class);
        System.out.println(theCoach.getYouDailyFortune());
    }
}
