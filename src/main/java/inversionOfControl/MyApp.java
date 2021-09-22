package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        //        Step 2: Create Spring container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //        Step 3: Retrieve beans from spring container
        Coach theCoach = context.getBean("inversionCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
    }
}
