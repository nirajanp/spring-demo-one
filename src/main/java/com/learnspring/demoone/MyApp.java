package com.learnspring.demoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //Coach b = new TrackCoach();

        // System.out.println(b.getDailyWorkout());

        // Create spring container or load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("coach", Coach.class);

        // call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        // close the context.
        context.close();

    }
}
