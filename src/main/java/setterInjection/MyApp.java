package setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("theCricketCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getYourDailyWorkout());
        System.out.println(theCoach.getYouDailyFortune());

        //close the context
        context.close();
    }
}
