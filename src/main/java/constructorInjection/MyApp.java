package constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("constCoach", Coach.class);
        //System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getYourDailyFortune());
    }
}
