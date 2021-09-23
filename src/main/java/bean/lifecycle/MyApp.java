package bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        // load xml config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-appContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("constCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        context.close();


    }
}
