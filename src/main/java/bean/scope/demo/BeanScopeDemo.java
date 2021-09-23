package bean.scope.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("constCoach", Coach.class);

        Coach alphaCoach = context.getBean("constCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // Print out the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        System.out.println(theCoach.getYourDailyTraining());

        // Close
        context.close();
    }
}
